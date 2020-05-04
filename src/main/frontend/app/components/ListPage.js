import React from "react"
import { Link } from "react-router-dom"

const ListPage = props => {

  const { imgUrl, name, vaccinationStatus, age, id} = props.data
  const type = props.data.petType.type

	return (
		<div className="row add-pets-section">
			<div className="small-12 medium-6 columns about-pets">
				<div className="about-pets-avatar">
					<Link to={`/pets/${type}/${id}`}>
						<img className="avatar-image test" src={imgUrl} alt={name} />
					</Link>
				</div>
				<div className="about-pets-author">
					<Link to={`/pets/${type}/${id}`}>
						<p className="author-name">{name}</p>
					</Link>
					<p className="author-location">Age: {age}</p>
					<p className="author-mutual">
						<strong>Up to Date on Shots?</strong>{" "}
						{vaccinationStatus == true ? "Yes" : "No"}
					</p>
				</div>
			</div>
		</div>
	)
}

export default ListPage