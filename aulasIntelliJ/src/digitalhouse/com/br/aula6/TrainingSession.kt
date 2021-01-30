package digitalhouse.com.br.aula6

class TrainingSession() {
    fun trainingA(player: FootbalPlayer){
        player.run()
        player.score()
        player.run()
        println("${player.name}: Agora vou começar a treinar. Minha experiência atual é: ${player.experience}")
        player.experience ++
        println("${player.name}: Eu treinei a tarde toda e minha experiência é: ${player.experience}")
    }
}