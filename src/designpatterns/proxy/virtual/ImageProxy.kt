package designpatterns.proxy.virtual

import java.util.concurrent.atomic.AtomicBoolean

class ImageProxy(
    private val url: String
) : Icon {
    override val width: Double
        get() = 80.0
    override val height: Double
        get() = 60.0

    private var icon: ImageIcon? = null
    private var isRetrieving: AtomicBoolean = AtomicBoolean(false)

    override fun paintIcon() {
        icon?.let {
            it.paintIcon()
            return@let
        }

        println("Loading CD cover, please wait...")

        if (isRetrieving.compareAndSet(false, true)) {
            val retrievalRunnable = Runnable {
                Thread.sleep(1000) // simulating request
                icon = ImageIcon(url)
                icon?.paintIcon()
            }
            Thread(retrievalRunnable).start()
        }
    }
}