import React, { useState } from "react"
import AdoptMeForm from "./AdoptMeForm"

const AnimalInfo = props => {
	const [formReveal, setFormReveal] = useState(false)
	let name
	let age
	let imgUrl
	let vaccinationStatus
	let adoptionStory
	let petId
	let vStatus


	if (props.pet) {
		name = props.pet.name
		age = props.pet.age
		imgUrl = props.pet.imgUrl
		vaccinationStatus = props.pet.vaccinationStatus
		adoptionStory = props.pet.adoptionStory
		petId = props.pet.id
	}

	vStatus = vaccinationStatus === true ? "Up to Date" : "Out of Date"

	const onClickHandler = event => {
		setFormReveal(true)
	}

	if (props.pet) {
		// console.log(img_url)
		return (
			<div>
				<div className="portfolio-resume-scrolling-container row">
					<div
						className="columns small-12 medium-5 portfolio-resume-overview"
						style={{
							backgroundSize: "cover",
							zIndex: 0,
							backgroundImage: `url(${imgUrl})`
						}}
					>
						<div className="portfolio-resume-overview-content"></div>
					</div>
					<div className="columns small-12 medium-7 portfolio-resume-scrolling">
						<h3>{name}</h3>
						<h5>Age: {age}</h5>

						<h5>Vaccination Status:</h5>
						<p>{vStatus}</p>

						<h5>Adoption Story:</h5>
						<p>{adoptionStory}</p>

						<button
							className="button primary expanded"
							type="button"
							onClick={onClickHandler}
						>
							Adopt Me
						</button>
					</div>
				</div>
				<div>
					<AdoptMeForm formReveal={formReveal} petId={petId} />
				</div>
			</div>
		)
	} else {
		return ""
	}
}

export default AnimalInfo