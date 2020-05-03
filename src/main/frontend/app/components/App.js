import React from "react"
import { Route, BrowserRouter, Link, Switch } from "react-router-dom"
//import SurrenderForm from "./SurrenderForm"
import TypeOfPetsContainer from "./TypeOfPetsContainer"
//import LoginPage from "./LoginPage"
import ListPageContainer from "./ListPageContainer"
import ShowPage from "./ShowPage"

const App = props => {
  return (
    <BrowserRouter>
     <Switch>
       <Route exact path="/" component={TypeOfPetsContainer} />
       <Route exact path="/pets" component={TypeOfPetsContainer} />
       <Route exact path="/pets/:type" component={ListPageContainer} />
       <Route exact path="/pets/:type/:id" component={ShowPage}/>
     </Switch>
    </BrowserRouter>
  )
}
export default App
