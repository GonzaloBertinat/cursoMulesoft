%dw 1.0
%output application/java
---
[{
	airlineName: "????",
	availableSeats: 1,
	departureDate: "????",
	destination: "????",
	flightCode: "????",
	origination: "????",
	planeType: "????",
	price: 2
} as :object {
	class : "com.mulesoft.training.Flight"
}]