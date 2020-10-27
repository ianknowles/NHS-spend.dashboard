package models

import controllers.routes.Assets

object Acknowledgements {
	val primary: List[Acknowledgement] = List(
		Acknowledgement(
			href = "https://www.thebritishacademy.ac.uk",
			alt = "British Academy logo",
			image = Assets.versioned("images/logos/BA_Primary-Logo-Black.png"),
			imageCSSClass = "ba",
		),
		Acknowledgement(
			href = "https://www.sociology.ox.ac.uk/",
			alt = "University of Oxford logo",
			image = Assets.versioned("images/logos/oxweb-logo-rect.svg"),
			imageCSSClass = "oxford",
		),
	)
}
