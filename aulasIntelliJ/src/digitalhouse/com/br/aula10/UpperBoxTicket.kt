package digitalhouse.com.br.aula10

class UpperBoxTicket(cost: Double, location: String, vipAdditionalCost: Double, upperBoxAdditionalCost: Double) : VIPTicket(cost,vipAdditionalCost+upperBoxAdditionalCost,location)