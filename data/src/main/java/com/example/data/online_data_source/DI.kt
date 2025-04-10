package com.example.data.online_data_source
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DI {

    @Binds
    abstract fun provideOnlineDataSource(
        onlineDataSourceImpl: OnlineDataSourceImpl
    ): OnlineDataSource
}