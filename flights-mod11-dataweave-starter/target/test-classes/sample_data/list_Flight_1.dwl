%dw 1.0
%output application/java
---
[{
	airlineName: "UNITED",
	availableSeats: 1,
	departureDate: "2018/10/04",
	destination: "????",
	flightCode: "500",
	origination: "????",
	planeType: "????",
	price: 2,
	totalSeats: 1
} as :object {
	class : "com.mulesoft.training.Flight"
},
{
	airlineName: "UNITED",
	availableSeats: 1,
	departureDate: "2018/10/04",
	destination: "????",
	flightCode: "500",
	origination: "????",
	planeType: "????",
	price: 2,
	totalSeats: 1
} as :object {
	class : "com.mulesoft.training.Flight"
}]