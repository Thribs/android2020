package digitalhouse.com.br.aula6

fun main(){
    var player1 = FootbalPlayer("Bebeto", 100, 100, 500, 40)
    var player2 = FootbalPlayer("Pelé",100,100,1000,50)
    var session = TrainingSession()
    session.trainingA(player1)
    session.trainingA(player2)
}