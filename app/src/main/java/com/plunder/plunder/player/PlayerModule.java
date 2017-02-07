package com.plunder.plunder.player;

import android.app.Application;

import com.plunder.plunder.AppModule;
import com.plunder.plunder.AppScope;
import dagger.Module;
import dagger.Provides;
import org.videolan.libvlc.LibVLC;

@Module(includes = {AppModule.class})
public class PlayerModule {
  @Provides @AppScope LibVLC provideLibVLC(Application app) {
    return new LibVLC(app.getApplicationContext());
  }
}
