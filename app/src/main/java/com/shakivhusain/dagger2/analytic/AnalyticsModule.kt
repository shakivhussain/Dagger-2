package com.shakivhusain.dagger2.analytic

import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsService(): AnalyticService {
        return MixPanelAnalytic()
    }

}