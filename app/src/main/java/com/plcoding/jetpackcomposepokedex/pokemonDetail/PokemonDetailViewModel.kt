package com.plcoding.jetpackcomposepokedex.pokemonDetail

import androidx.lifecycle.ViewModel
import com.plcoding.jetpackcomposepokedex.data.remote.responses.Pokemon
import com.plcoding.jetpackcomposepokedex.repository.PokemonRepository
import com.plcoding.jetpackcomposepokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
  private val repository: PokemonRepository
):ViewModel() {

   suspend  fun pokemonInfo(pokemonName:String):Resource<Pokemon>{
       return repository.getPokemonInfo(pokemonName)
     }
}