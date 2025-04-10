package com.example.data.api

import android.util.Log
import com.example.data.api.core.ApiConst
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiManger {
    private var retrofit: Retrofit? = null;
     fun getWebServices(): WebServices {
        val loggerInterceptor = HttpLoggingInterceptor{
            Log.e("Api manger", "Body: $it")
        }.setLevel(HttpLoggingInterceptor.Level.BODY)
        val okHttpClient = OkHttpClient.Builder().addInterceptor(loggerInterceptor).build()
        if (retrofit == null) {
            retrofit =
                Retrofit.Builder().baseUrl(ApiConst.baseUrl)
                    .addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build()
        }

        return retrofit!!.create(WebServices::class.java)
    }
}


@Module
object NetworkModule
    @Provides
    fun provideGsonConverterFactory():GsonConverterFactory{
        return GsonConverterFactory.create()
    }
    @Provides
    fun provideLoggingInterceptor():HttpLoggingInterceptor{
        return HttpLoggingInterceptor{
            Log.e("Api manger", "Body: $it")
        }.setLevel(HttpLoggingInterceptor.Level.BODY)
    }
    @Provides
    fun provideClient(loggingInterceptor: HttpLoggingInterceptor):OkHttpClient{
        return OkHttpClient.Builder().addInterceptor(loggingInterceptor).build()
    }

    @Provides
    fun provideRetrofit(client: OkHttpClient,gsonConverterFactory: GsonConverterFactory):Retrofit{
        return Retrofit.Builder().baseUrl(ApiConst.baseUrl).client(client).addConverterFactory(gsonConverterFactory).build()
    }
    @Provides
    fun provideWebServices(retrofit: Retrofit):WebServices{
        return retrofit.create(WebServices::class.java)
    }
}