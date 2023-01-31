import java.lang.annotation.Native
import java.time.Period
import java.util.DoubleSummaryStatistics
import kotlin.reflect.KFunction2
import java.util.Scanner
import java.util.StringJoiner

/*Та самая база*/
/*fun main() {
    println("Hello World!");
    val a: Int = 1
    val b: Float = 1.222F
    val c: String = "good"
    var d = "lghlgs"
    var sum = a+b
    println(a)
    println(b)
    println(c)
    println(d)
    println(sum)
    println("Bebra ravna = $a-3223 + $b + $d")
    println(sum/4827482749238)
}*/
/*Вветвления и циклы*/
/*fun main() {
    var a: Int = 1
    var b: Int = 10
    var max1 =a
    var max2: Int
    var max4: Int = 6
    var sum: Int = a+b
    /*if(a<b) max1=b
    println(max1)*/
    if(a>b) {
        max2=a
    }else {
        max2=b
    }
    println(max2)

    val max3 = if ((a+b)>max4) sum else max4
    println(max3)
}*/
/*When*/
/*fun main() {
    val x = 1
    when(x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
    else -> {println("x ne raven ni 1, ne 2")}

    }
}*/
/*Цикл for*/
/*fun main() {
    var range = -5 .. 5
    for(i in range){
        if (i < 0) {
            println("Element $i")
        }else println("bibaaaa")
    }
    for(i in 10 downTo 1 step 2){
        println("$i")
    }
    for(letter in 'Z' downTo 'A') println(letter)

}*/
/*break*/
/*fun main() {
    for(i in 1..5) {
        println(i)
        if (i == 3) {
            break
        }
    }
}*/
/*continue*/
/*fun main() {
    for (i in 1 .. 10) {
        if (i == 5){
            continue
        }
        println(i)
    }
}*/
/*While, do while*/
/*fun main() {
    var x = 10

    while (x>0){
        x--
        x = x + 2
        println(x)
        if (x==10000) {
            println("STOP NIGER")
            break
        }
    }
    do {
        x--
        println(x)
    } while(x>0)
}*/
/*Ну типА практика*/
/*fun main() {
    var x = 99
    if (x == 100) {
        while (x > 0) {
            x--
            println(x)
        }
    }
    else if (x > 100) {
            for (i in 1..5)
                println(i)
        }
    else {
        println("bebra")

    }

}*/
/*fun main() {
    var x = 100
    when (x) {
        100 -> {while (x > 0)
        {x--
        println(x)}}
        101, 102, 103, 104, 105, 106, 107, 108, 110 -> {
            for (i in 1..5)
                println(i)
        }
        else -> {
            println("bebra")
        }
    }
}*/
/*Функции*/
/*fun  main(args : Array<String>) {
    PrintMyName()
}
fun  PrintMyName() {
    println("Privet ia Egor!")
}*/
/*fun  main() {
    SHtotoPishet(10, 60, alp = 50)
    var data = SHtotoPishet(number = 50, mulp = 15)
}
fun  SHtotoPishet(value: Int, mulp: Int = 50, alp: Int= 2, number: Int = 50): Int {
    println("$value * 5 = ${value * 5}")
    println("$mulp * $alp = ${mulp * alp}")
    return number * mulp
}*/
/*fun  main() {
    var data = SHtotoPishet(number = 50, mulp = 15)
    println(data)
}
fun  SHtotoPishet(mulp: Int = 50, number: Int = 50): Int {
    return number * mulp
}*/
/*fun  main() {
    var data = SHtotoPishet(15)
    println(data)
}
fun  SHtotoPishet(mulp: Int) = mulp * mulp*/
/*fun  main() {
    SHtotoPishet(2)
}
fun  SHtotoPishet(mulp: Int): Int {
    val mulp2:Int = mulp + 1
    println(mulp2)
    return mulp2
}*/
/*fun main() {
    println(getString("fdfgsdgsgsdgsg"))
    println(getValue(1))
    println(getDouble(1.4892304824028422242424))
}
fun getValue(value: Int): Int {
    return value + 1
}
fun getString(value: String): String {
    return "Znachenie ravno: $value"
}
fun  getDouble(value: Double): Double {
    return 1.23959827592572589258028
}*/
/*fun main() {
    val value = ::add //Переменная сама является функцией.
    println(value(1, 5))
    println(printRessult(::add, 4, 5))
}
fun add(a: Int, b: Int): Int {
    return a+b
}
fun printRessult(function: (Int, Int) -> Int, a:Int, b:Int) {
    val result = function(a, b)
    println(result)
}*/
/*Практика по функциям*/
/*fun  main() {
    Result()
    println(ResultC( ::Result, 4, 5))
    println(getString("lkslmblkbm"))
    println(getInt())
}
fun Result(a: Int = 5, b: Int = 10, c: Int = 15): Int {
    println(a+b+(c*a*b)/5)
    return a+b+(c*a*b)/5
}
fun ResultC(function: (Int, Int)-> Int, a: Int, b: Int) {
    var value = function(a,b)
    println(value)
}
fun getString(value: String):String {
    return "Koroche: $value"
}
fun getInt(value: Int = 5):Int {
    return value
    println(value)
}*/
/*Лямбды*/
/*fun main() {
    val hello = {println("Hello World")}
    hello()
    hello()

}*/
/*fun main() {
    {println("Hello World")}();
    {println("Hello again")}()

}*/

/*fun main() {
    val printer = {message: String -> println(message)}
    printer("Hello")
    printer("Good Bye")

}*/

/*fun main() {
    {message: String -> println(message)}("Hello World")
}*/

/*fun main() {
    val sum = {x:Int, y:Int -> println(x+y)}
    sum(2,3)
    sum(50, 50)
}*/

/*fun main() {
    val sum = {
        x:Int, y:Int ->
        val result = x+y
        println("$x + $y = $result")
    }
    sum(5,5)
}*/
/*fun main() {
    val hello = {println("Hello")}
    val h = hello()

    val printer = {message:String -> println(message)}
    val p = printer("Hello world!")
}*/

/*fun main() {
    val sum = {x:Int , y:Int -> x+ y}
    val a = sum(10, 5)
    val b = sum(3, 4)
    println("a = $a b = $b")
}*/

/*fun main() {
    val sum = {
        x:Int, y:Int ->
        val result = x+y
        println("$x + $y = $result")
        result
    }
    sum(5,5)
}*/

/*fun main() {
    val sum = {x:Int,y:Int -> x+y}
    DoOperetion(3,4,sum)
    DoOperetion(3,4,{a:Int, b:Int -> a*b})
}
fun DoOperetion(x:Int,y:Int,op: (Int,Int) -> Int) {
    val result = op(x,y)
    println(result)
}*/

/*fun main() {
    val sum: (Int,Int) -> Int = {x,y -> x+y}
    DoOperetion(3,4){a, b -> a*b}
}
fun DoOperetion(x:Int,y:Int,op: (Int,Int) -> Int) {
    val result = op(x,y)
    println(result)
}*/

/*лассы и конструкторы в котлин*/
/*class Persen constructor(firstName: String){}*/

/*class InitOrderDemo(name:String) {
    val firstPripery = "ервое свойство: $name".also(::println)
    init {
        println("Первый блок инициализации $name")
    }
    val seckondPropery= "Второе сво-во ${name.length}".also(::println)

    init {
        println("Второй блок инициализации ${name.length}")
    }
}*/

/*class Person(val perts: MutableList<Pet>= MutablistOf())
class Pet {
    constructor(owener: Person)
    owner.perns.add(this)
}*/
/*open class Polygon{
    open fun draw() {

    }
}
abstract class WildShape: Polygon() {
    /*Классы которые наследуют WildShape , должны должны предоставлять свой собственный метод рисования вместо использования по умолчанию для полигона*/
    abstract override fun draw()
}*/
/*private fun foo() {}
public var bar: Int = 5
    private set
internal  var baz = 6
*/
/*open class Outer {
    private val a = 1
    protected  open val b =  2
    internal open val c = 3
    val d = 4

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass: Outer () {
    //a не видно
    // b, c  и d видно
    //класс Nested видно

    override val b  = 5 // protected
    override val c = 7 // internal

}

class Unrealateb (o:Outer) {
    // o.a  o.b не видно
    // o.c o.d видно(тот же модуль)
    // Outer.Nested не видно и Nested::e так же не видно
}*/
/*ООП*/
/*class Car {
    val model: String? = null
    var topSpeed = 100

    fun start () {
        println("starting car now")
    }

    fun drive (speed:Int) {
        println("drivind at $speed")
    }
}*/

/*fun main () {
    open class Mom(nativeTongue: String) {
        open val hairColor = "brown"
        val eyeColor = "blue"
        open fun say(message: String) {
            println("mom say $message")
        }
    }

    class Daughter(nativeTongue: String) : Mom(nativeTongue) {
        override val hairColor = "blonde"
        override fun say(message: String) {
            println("daughter says $message")
        }
    }
    class Sun(nativeTongue: String) : Mom(nativeTongue) {
        override val hairColor = "dark"
        override fun say(message: String) {
            println("Sun say $message")
        }
    }

    val calor = Daughter("french")
    println(calor.hairColor)
    calor.say("Hi")

    val calor2 = Sun("dark")
    println(calor2.hairColor)
    calor2.say("Xochy est")
}*/

/*fun main() {
    class PN() {
        var message: String = "No message"
        fun UpdataMessage(message: String) {
            this.message = message
        }
    }

    val postit = PN()
    println(postit.message)
    postit.UpdataMessage("Meeting at 5")
    println(postit.message)
}*/
/*fun main () {
    abstract class Container {
        fun pour() {
            println("aokngAOKWNG")
        }
    }

    class Jug : Container() {}
    class Bottle : Container() {}
}*/
/*fun main () {
    open class Mom() {
        open fun say(message: String) {
            println("mom say $message")
        }
    }

    class Daughter() : Mom() {
        override fun say(message: String) {
            println("daughter says $message")
        }
    }
}*/

/*fun main() {
    open class Mom() {
        open fun say(message: String) {
            println("mom say $message")
        }

        fun say() {
            println("mom say Hi")
        }

        fun say(message: String, times: Int) {
            var i = 0
            while (i<3) {
                println(message)
                i++
            }
        }
    }
    open class Dauther():Mom() {
        var colorYes = "blak"
        fun say2(message: String) {
            println("Dauther say $message")
            println("<3")
        }
    }
    open class father():Mom() {
        var fraza = "xochy est"
        fun sayF(message: String) {
            println("Father say $message")
            println("$message, niam niam")
        }
    }
    var color = Mom()
    color.say("Hi", 23)
    color.say()

    var color2 = Dauther()
    color2.say2("hell0 peggi")
    println(color2.colorYes)

    var color3 = father()
    color3.sayF("Ocorochok")
    println(color3.fraza)
}*/

/*интерфейсы абт=стракты классы и дата-классы*/

/*interface Myinterface {
    fun bar()
    fun foo() {
        //Необязательное тело
    }
}

class Child : Myinterface {
    override fun bar() {
        //тело
    }
}*/

/*interface Named {
    val name: String
}
interface Person: Named {
    val FirstName : String
    val lastName : String
    override val name : String get() = "$FirstName $lastName"
}
data class Employee(
    override val FirstName : String,
    override val lastName: String
): Person*/

/*abstract class Human(val name: String) {
    fun hello() {
        println("My name is $name")
    }
}
class Person(name: String) : Human(name)
*/

/*abstract class Human (val name String) {
    abstract var age: Int
    abstract fun hello()
}
class Person(name: String):Human(name) {
    override var age: Int=1
    override fun hello() {
        println("My name is $name")
    }
}*/

/*abstract class Human (val name String) {
    abstract var age: Int
    abstract fun hello()
}
class Person(name: String, override var age: Int):Human(name) {
    override fun hello() {
        println("My name is $name")
    }
}*/

/*data class Person(val name: String, val age: Int)

fun main() {
    val alice : Person = Person("Alice", 24)
    println(alice.copy())
}*/

/*data class Person(val name: String, val age: Int) {
    override fun toString(): String {
        return "Name: $name Age: $age"
    }
}*/

/*data class Person(val name: String, val age: Int)

fun main() {
    val alice: Person = Person("Alice", 24)
    val kate = alice.copy(name = "kate")
    println(alice.toString())
    println(kate.toString())
}*/

/*Коллекции в котлин*/
/*fun main() {
    val animals = listOf("Dog", "Cat", "Cow")
    if (animals.size >0) {
        println(animals[0])

    }

    println("------------------------")

    for (item in animals)
        println(item)

    println("------------------------")

    if (animals.contains("Cow")) {
        println(animals.indexOf("Cow"))
    }
    println("------------------------")

    val animals2 = mutableListOf("Dog", "Cat")
    animals2.add(1, "Cow")
    println(animals2)

    println("------------------------")

    if (animals2.contains("Cow")) {
        animals2.remove("Cow")
        println(animals2)
    }

    println("------------------------")

    if (animals2.size > 1) {
        animals2.removeAt(1)
        println(animals2)
    }

    println("------------------------")

    if (animals2.size > 0) {
        animals2.set(0, "Cow")
        println(animals2)
    }

    println("------------------------")

    animals2.addAll(animals)
    println(animals2)

    println("------------------------")

    animals2.removeAll(animals)
    println(animals2)

    println("------------------------")

    println(animals.shuffled())

    println("------------------------")

    val animalsSet = setOf("Cat","Cow","Dog")
    println(animalsSet)

    println("------------------------")

    for (item in animalsSet)
        println(item)

    println("------------------------")

    data class Recipe(val s: String)
    val r1 = Recipe("Pizza")
    val r2 = Recipe("Burger")
    val r3 = Recipe("Taco")

    val recipeMap = mapOf("Recipe1" to r1, "Recipe 2" to r2, "Recipe3" to r3)

    for ((kay, value) in recipeMap) {
        println("Kay is $kay, value is $value")
    }

    recipeMap.put("Recipe", r3)
    val r4 = Recipe("Coffe")
    val r5 = Recipe("Tea")
    val toAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    recipeMap.putAll(toAll)

    recipeMap.remove("Recipe2")
    recipeMap.clear()
    val toRemove = Recipe("Burger")
    recipeMap.remove("Recipe2", toRemove)
    println(recipeMap)
}*/

/*МОнипуляции с колекциями котлин*/

/*fun main() {
    var people = sequenceOf("Tom", "Sam", "Mike", "Bob", "Alice")
    people = people. filter { it.length == 3 }
    println(people.joinToString())

    var employes = listOf(
        Person("Tom", 37),
        Person("Bob", 41),
        Person("Sam", 25)
    )
    employes = employes.filter{it.age > 30}
    println(employes.joinToString())

}
data class Person(val name: String, val age: Int)*/

/*fun main() {
    val people = listOf(
        Person("Tom"), Employee("Bob"),
        Person("Sam"), Employee("Mike")
    )
    val employees = people.filterIsInstance<Employee>();
    println(employees)
}
open class Person(val name: String){
    override fun toString(): String = name
}
class Employee(name: String): Person(name)*/

/*fun main() {
    var people = sequenceOf("Tom", "Sam", "Mike", "Bob", "Alice")
    println(people.all{it.length == 3})
    println(people.all{it.length != 10})

    println(people.none{it.length == 3})
    println(people.none{it.length != 10})

    println(people.any{it.length == 3})
    println(people.any{it.length != 10})
}*/

/*fun main() {
    val people = listOf(People("Tom"),People("Sam"),People("Bob"))
    val names = people.map{it.name}
    println(names)
}
class People(val name: String)*/

/*fun main() {
    val people = listOf(People("Tom"),People("Sam"),People("Bob"))
    val names = people.mapIndexed(){index, p -> "${index+1}.${p.name}"}
    println(names)
}
class People(val name: String)*/


/*fun main() {
    var people = listOf("Tom", "Sam", "Mike", "Bob", "Alice")
    val numbers = listOf(-6, -7, -3, 1, 6, 9)
    val sortedPeple = people.sorted()
    val sortedNumbers = numbers.sorted()
    println(sortedPeple)
    println(sortedNumbers)

    println(people.sortedDescending())
    println(numbers.sortedDescending())
}*/

/*fun main() {
    val people = listOf(
        Person("Tom", 37),
        Person("Bob", 41),
        Person("Sam", 25)
    )

    val sortedPeople = people.sortedBy()

    println(sortedPeople)

    println(people.sortedByDescending())

}
open class Person(val name: String, val age: Int){
    override fun compareTo(other: Person): Int = age - other.age
    override fun toString(): String = "$name ($age)"
}*/

/*fun main() {
    val people = listOf(People("Tom", 37),People("Sam", 25),People("Bob", 41))
    val sortedByName = people.sortedBy{it.name}
    println(sortedByName)

    val sortedByAge = people.sortedBy {it.age}
    println(sortedByAge)

    val sortedByAgeDec = people.sortedByDescending { it.age }
    println(sortedByAgeDec)

}
open class People(val name: String, val age: Int){
    override fun toString() : String = "$name ($age)"
}*/

/*Исключения и преобразования типов*/

/*fun main() {
    try {
        val x: Int = 0
        val z: Int = 0
        println("z = $z")
    }
    catch (e: Exception) {
        println("Exception")
        println(e.message)
    }
}*/

/*fun main() {
    val ceckedAge1 = checkAge(5)
    val chekeedAge2 = checkAge(-115)
}
fun checkAge(age: Int): Int {
    if (age < 1 || age > 110) throw Exception("Invalid value $age Age must be greater than 0 and less than 110")
    println("Age $age is valid")
    return age
}*/

/*fun main() {
    try {
        val ceckedAge1 = checkAge(5)
        val chekeedAge2 = checkAge(-115)
    }
    catch (e: Exception) {
        println(e.message)
    }
}
fun checkAge(age: Int): Int {
    if (age < 1 || age > 110) throw Exception("Invalid value $age Age must be greater than 0 and less than 110")
    println("Age $age is valid")
    return age
}*/

/*fun main () {
    val tom = Person("Tom")
    val bob = Employee("Bob", "JetBrains")

    checkEmployment(tom)
    checkEmployment(bob)
}
fun checkEmployment(person: Person) {
    if (person is Employee) {
        println("${person.name} works in ${person.company}")
    }
    else {
        println("${person.name} does not have a job")
    }
}
open class Person(val name: String)
open class Employee(val name: String, val company: String)*/

/*Нулибол типы...*/

/*fun main() {
    var bob: Person = Person("Bob")
    var tom: Person? = Person("Tom")
    tom = null
    println(tom)
    println(bob)
}
class Person(val name: String)*/

/*fun main() {
    var tom: Person? = Person("Tom")
    val tomName: String? = tom?.name?.uppercase()
    println(tomName)

    var bob: Person? = Person("Bob")
    val bobName: String? = bob?.name?.uppercase()
    println(bobName)

    var sam: Person? = Person("Sam")
    val samName: String? = sam?.name?.uppercase()
    println(samName)
}
class Person(val name: String)*/

/*fun main () {
  try {
      val name: String? = "Tom"
      val id: String = name!!
      println(id)
  } catch (e: Exception) {
      println(e.message)
  }
}*/

/*fun main() {
    val hello: String = "Hello world"
    println(hello.worldCount('i'))
    println(hello.worldCount('o'))
    println(4.square())
    println(6.square())
}
fun String worldCount(c: Char) {
    val count = 0
    for(n in this){
        if(n == c) {count++}
    }
    return count
}
fun Int square(): Int {
    return this * this
}*/

/*fun main() {
    val tom: Person<Int> = Person(367, "Tom")
    val bob: Person<String> = Person("A65", "Bob")

    println("${tom.id} - ${tom.name}")
    println("${bob.id} - ${bob.name}")
}
class Person<T>(val id: T, val name: String)*/

/*fun main() {
    val tom = Pearson("asjfn2", "Tom")
    tom.checkid("asjfn2")
    tom.checkid("q34tt")
}
class Pearson <T>(val id: T, val name: String) {
    fun checkid(_id: T){
        if (id == _id) {
            println("The same")
        }
        else{
            println("Different")
        }
    }
}*/

/*fun main(){
    val arr1 = getBiggest(arrayOf(1,2,3,4), arrayOf(3,4,5,6,7,7))
    arr1.forEach {item -> print("$item")}

    println()

    val arr2 = getBiggest(arrayOf("Tom", "Sam", "Bob"), arrayOf("Kate", "Alice"))
    arr2.forEach {item -> print("$item")}

}*/

fun main () {

}

//skffffffffffffffffffffffffffffffffffs[pgjspk


//sdfffffsffsdfsdfg





































