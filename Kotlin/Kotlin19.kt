
sealed class NetworkState{
    data class Error(val errorText: String):NetworkState()
    object Loading: NetworkState()
    data class Loaded(val content: String): NetworkState()
}
fun main(){
    val data: NetworkState=NetworkState.Loaded("Data loaded")
    processState(data)
}
fun processState(state:NetworkState){
    when(state){
        is NetworkState.Error->{println("Error occured: ${state.errorText}")}
    is NetworkState.Loading->{/*show progressbar*/}
        is NetworkState.Loaded->{println("Content: ${state.content}")}
    }
}