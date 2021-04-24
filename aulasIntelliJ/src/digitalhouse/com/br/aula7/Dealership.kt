package digitalhouse.com.br.aula7

class Dealership(val name: String, var salesNum: Int, var income: Double) {
    val sales = mutableListOf<Sale>()
    fun newSale(car: Car, client: Client,value: Double){
        sales.add(Sale(value,true,client))
        salesNum = sales.size
        income += value
        println("O cliente ${client.name} ${client.surname} comprou o veículo ${car.make} ${car.model} ${car.color}, ano ${car.year} por R$$value")
        println("A concessionária $name vendeu um total de $salesNum veículos, totalizando uma receita de R$$income")
    }
}