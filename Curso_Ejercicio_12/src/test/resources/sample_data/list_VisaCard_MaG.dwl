%dw 1.0
%output application/java
---
[{
	amount_granted: 1,
	card_no: "61616",
	partner: "????",
	processor_id: 1
} as :object {
	class : "com.mulesoft.training.model.VisaCard_MaG"
}]