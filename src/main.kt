fun main() {
    println("Вас приветствует программа Викторина3000!") // Приветствие
    println("Тема:Нет темы") // Тема
    println("Чтобы написать ответ, введите букву ответа. Не нужно вводить сам ответ. Пишите кириллицей! Напишите 'Хорошо' или 'Ок', чтобы продолжить.")//Информация про викторину
    var ddd = readLine()!!.toString()
    when(ddd)
    {
        "Хорошо" -> println("Начинаем!")
        "Ок" -> println("Начинаем!")
        "Ok" -> println("Начинаем!")
        else ->println("Ошибка. В случае ошибки в написании ответа, обращайтесь к разработчику. ")
    }
    println("1 вопрос: Кто из президентов США написал свой собственный рассказ про Шерлока Холмса?") //1 вопрос
    println("А - Франклин Рузвельт" +
            " Б - Джон Кеннеди" +
            " В - Рональд Рейган")
    val a = readLine()!!.toString()
    when(a)
    {


        "А" -> println("Правильно!")
        "Б" -> println("Неправильно. Правильный ответ:А.")
        "В" -> println("Неправильно. Правильный ответ:А.")
        else ->println("Ошибка. В случае ошибки в написании ответа, обращайтесь к разработчику. ")

    }
    println("2 вопрос: Туристы, приезжающие на Майорку, обязаны заплатить налог…") //2 вопрос
    println("А - На плавки" +
            " Б - На пальмы" +
            " В - На солнце")
    val b = readLine()!!.toString()
    when(b)
    {

        "А" -> println("Неправильно! Правильный ответ:В.")
        "Б" -> println("Неправильно! Правильный ответ:В.")
        "В" -> println("Правильно!")
        else ->println("Ошибка. В случае ошибки в написании ответа, обращайтесь к разработчику. ")


    }
    println("3 вопрос: Откуда пошло выражение «деньги не пахнут?") //3 вопрос
    println("А - От подателей за провоз парфюмерии" +
            " Б - От сборов за нестиранные носки" +
            " В - От налога на туалеты")
    val k = readLine()!!.toString()
    when(k) {

        "А" -> println("Неправильно! Правильный ответ:В.")
        "Б" -> println("Неправильно! Правильный ответ:В.")
        "В" -> println("Правильно!")
        else -> println("Ошибка. В случае ошибки в написании ответа, обращайтесь к разработчику. ")


    }
    println("4 вопрос: Какую пошлину ввели в XII веке в Англии для того чтобы заставить мужчин пойти на войну?") //4 вопрос
    println("А - Налог на тунеядство" +
            " Б - Налог на трусость" +
            " В - Налог на отсутствие сапог")
    val m = readLine()!!.toString()
    when(m)
    {

        "А" -> println("Неправильно! Правильный ответ:Б.")
        "Б" -> println("Правильно!")
        "В" -> println("Неправильно! Правильный ответ:Б.")
        else ->println("Ошибка. В случае ошибки в написании ответа, обращайтесь к разработчику. ")


    }
    println("5 вопрос: Российский мультфильм, удостоенный «Оскара», — это…") //5 вопрос
    println("А - «Простоквашино»" +
            " Б - «Старик и море»" +
            " В - «Винни-Пух»")
    val d = readLine()!!.toString()
    when(d)
    {

        "А" -> println("Неправильно! Правильный ответ:Б.")
        "Б" -> println("Правильно!")
        "В" -> println("Неправильно! Правильный ответ:Б.")
        else ->println("Ошибка. В случае ошибки в написании ответа, обращайтесь к разработчику. ")


    }
    println("6 вопрос: Один известный писатель рассказывал, что списал образ старушки-вредины со своей бывшей жены.")
    println("При этом бабулька оказалась удивительно похожей на Коко Шанель. На голове у нее всегда была шляпка со складной тульей, благодаря которой она и получила прозвище. Как её звали?") //6 вопрос разбит, для вмещения в строку
    println("А - Шапокляк" +
            " Б - Красная Шапочка" +
            " В - Мадам Баттерфляй")
    val s = readLine()!!.toString()
    when(s) {

        "А" -> println("Правильно!")
        "Б" -> println("Неправильно! Правильный ответ:А.")
        "В" -> println("Неправильно! Правильный ответ:А.")
        else -> println("Ошибка. В случае ошибки в написании ответа, обращайтесь к разработчику. ")

    }
    println("7 вопрос: Что в Российской Империи было вещевым эквивалентом денег?") //7 вопрос
    println("А - Шкуры пушных зверей" +
            " Б - Крупный рогатый скот" +
            " В - Табак")
    val l = readLine()!!.toString()
    when(l)
    {

        "А" -> println("Правильно!")
        "Б" -> println("Неправильно! Правильный ответ:А.")
        "В" -> println("Неправильно! Правильный ответ:А.")
        else ->println("Ошибка. В случае ошибки в написании ответа, обращайтесь к разработчику. ")

    }
    println("8 вопрос: Какую комнату, бесследно пропавшую из России во время Второй мировой войны, до сих пор не могут отыскать?") //8 вопрос
    println("А - Волшебную" +
            " Б - Алмазную" +
            " В - Янтарную")
    val g = readLine()!!.toString()
    when(g)
    {

        "А" -> println("Неправильно! Правильный ответ:В.")
        "Б" -> println("Неправильно! Правильный ответ:В.")
        "В" -> println("Правильно!")
        else ->println("Ошибка. В случае ошибки в написании ответа, обращайтесь к разработчику. ")

    }
    println("На этом пока все. В случае ошибки в программе, в случае нахождении бага обращаться к разработчику. Пишите в дискорд пользователю: ") //Завершение
    println("Магистр Йода#8748")
}
