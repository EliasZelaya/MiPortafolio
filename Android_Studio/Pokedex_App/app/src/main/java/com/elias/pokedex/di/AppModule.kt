package com.elias.pokedex.di

import com.elias.pokedex.data.remote.PokeApi
import com.elias.pokedex.repository.PokemonRepository
import com.elias.pokedex.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module// Es para marcar una clase como un modulo de Hilt
@InstallIn(SingletonComponent::class)//Especifica en que componente de Hilt se debe instalar el modulo
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRepository(
        api: PokeApi
    ) = PokemonRepository(api)

    @Singleton
    @Provides
    fun providePokeApi(): PokeApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())//Convierte el json a data class de kotlin
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)
    }
}