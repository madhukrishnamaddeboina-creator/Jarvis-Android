package com.jarvis.assistant

import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

        private lateinit var tts: TextToSpeech

            override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)

                                tts = TextToSpeech(this) {
                                                if (it == TextToSpeech.SUCCESS) {
                                                                    tts.language = Locale.US
                                                                                    tts.speak("Hello Sir, Jarvis is now online.", TextToSpeech.QUEUE_FLUSH, null, null)
                                                }
                                }
            }

                override fun onDestroy() {
                            if (::tts.isInitialized) tts.shutdown()
                                    super.onDestroy()
                }
}
                }
                                                }
                                }
            }
}