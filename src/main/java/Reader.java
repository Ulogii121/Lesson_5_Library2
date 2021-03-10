import java.util.Random;

class Reader {
    //Выбираем конкретную книгу из массива книг
    Book choiceBook(Book books[]) {
        Random random = new Random();
        final int i = random.nextInt(books.length);
        //System.out.println(Books[i]); //Для проверки
        return (books[i]);
    }

    //Читаем выбранную книгу
    Book readBook(Book books) {
        System.out.println(books.title);
        return (books);
    }

    //Оцениваем выбранную книгу
    void rateBook(Book books) {
        int a, b, c, d, rate;
        //Определяем значения количества символов
        if (books.title == null) {
            a = 0;
        } else {
            a = books.title.length();
        }
        if (books.author == null) {
            b = 0;
        } else {
            b = books.author.length();
        }
        c = books.number;
        d = books.page;
        //Считаем оценку
        rate = a + b - c + d;
        //Коррекция на пустые поля
        Random random = new Random();
        if (a == 0) {
            rate = rate - random.nextInt(10);
        }
        if (b == 0) {
            rate = rate - random.nextInt(10);
        }
        if (c == 0) {
            rate = rate - random.nextInt(10);
        }
        if (d == 0) {
            rate = rate - random.nextInt(10);
        }
        //System.out.println("Символов в названии: " + a); //Для проверки
        //System.out.println("Символов в 'авторе': " + b); //Для проверки
        //System.out.println(c); //Для проверки
        //System.out.println(d); //Для проверки
        System.out.println("Оценка пользователя: " + rate);
    }
}
