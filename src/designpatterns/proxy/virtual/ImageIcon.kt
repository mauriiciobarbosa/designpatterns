package designpatterns.proxy.virtual

class ImageIcon(
    private val imageUrl: String
) : Icon {

    override val width: Double
        get() = 200.0
    override val height: Double
        get() = 100.0

    override fun paintIcon() {
        print("Showing image from url $imageUrl")
    }
}