package com.launchacademy.adopt.controllers.api.v1;

import com.launchacademy.adopt.models.SurrenderApplication;
import com.launchacademy.adopt.repositories.SurrenderApplicationRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurrenderApiController {
  private SurrenderApplicationRepository surrenderAppRepo;

  @Autowired
  public void SurrenderApplicationApiController(SurrenderApplicationRepository surrenderAppRepo) {
    this.surrenderAppRepo = surrenderAppRepo;
  }

  @NoArgsConstructor
  private class InvalidSurrenderAppException extends RuntimeException{}

  @ControllerAdvice
  private class InvalidSurrenderAppAdvice{
    @ResponseBody
    @ExceptionHandler(InvalidSurrenderAppException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    String invalidSurrenderApp(InvalidSurrenderAppException ic) {
      return "";
    }
  }

  @GetMapping("api/v1/pet_surrender_applications")
  public Iterable<SurrenderApplication> getSurrenderList() {
    return surrenderAppRepo.findAll();
  }

  @PostMapping //("api/v1/pet_surrender_applications")
  public SurrenderApplication create(
      @RequestBody @ModelAttribute SurrenderApplication surrenderApp, BindingResult bindingResult, Model model) {
    if(bindingResult.hasErrors()) {
      throw new InvalidSurrenderAppException();
    } else {
      return surrenderAppRepo.save(surrenderApp);
    }
  }
}
