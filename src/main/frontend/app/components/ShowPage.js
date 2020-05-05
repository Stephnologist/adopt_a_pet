import React, { useState, useEffect } from "react"
import AnimalInfo from "./AnimalInfo"

const ShowPage = props => {

	const [pet, setPet] = useState({})
	const petId = props.match.params.id
	let type = props.match.params.type

	useEffect(() => {
		fetch(`/api/v1/${type}/${petId}`) //fetch(`/api/v1/pets/${petId}`)
			.then(response => {
				if (response.ok) {
					return response
				} else {
					let errorMessage = `${response.status} (${response.statusText})`,
						error = new Error(errorMessage)
					throw error
				}
			})
			.then(response => response.json())
			.then(fetchedPet => {
				setPet(fetchedPet)
			})
	}, {})

  if(pet){
  return <AnimalInfo key={petId} pet={pet} />
  } else {
  <p>404</p>
  }
}

export default ShowPage