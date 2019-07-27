package designpatterns.proxy.dynamic

class Person(
    private var _name: String,
    private var _gender: String,
    private var _interests: String = ""
) : PersonBean {
    private var rating = 0
    private var ratingCount = 0

    override var name: String
        get() = _name
        set(value) {
            _name = value
        }
    override var gender: String
        get() = _gender
        set(value) {
            _gender = value
        }
    override var interests: String
        get() = _interests
        set(value) {
            _interests = value
        }
    override var hotOrNotHotRating: Int
        get() = if (ratingCount == 0) 0 else rating / ratingCount
        set(value) {
            rating += value
            ratingCount++
        }
}