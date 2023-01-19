package com.shakivhusain.dagger2.di

import com.shakivhusain.dagger2.AnalyticService
import com.shakivhusain.dagger2.MixPanelAnalytic
import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsService(): AnalyticService{
        return MixPanelAnalytic()
    }

}