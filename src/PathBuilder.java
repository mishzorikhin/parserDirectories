import java.io.File;

public class PathBuilder {

    Short year;
    Short qr;

    public void AddYear(Short addYear){

        year = addYear;
        System.out.println(year);

    }

    public void AddQr(Short addQr){

        qr = addQr;
    }

    public void pathByName(String NameFile) {
        switch(NameFile){
            case("Устав_действующий"):
                new File("D:\\Досье по ЮЛ/Юридическое досье/Учредительные и иные внутренние документы (положения)/").mkdirs();
                break;

            case("Положение о СД"):
                new File("D:\\Досье по ЮЛ/Юридическое досье/Учредительные и иные внутренние документы (положения)/").mkdirs();
                break;

            case("Бухгалтерская отчетность_форма 1"):
                new File("D:\\Досье по ЮЛ/Финансовое досье/" + year + "/" + qr + "Квартал/Бухгалтерская отчетность/" ).mkdirs();
                break;

            case("Описание_деятельности_ГК "):
                new File("D:\\Досье по ГК/Описание бизнеса/").mkdirs();
                break;

            case("Решение_назначение ЕИО"):
                new File("D:\\Досье по ЮЛ/Юридическое досье/Документы, подтверждающие полномочия на совершение сделки/").mkdirs();
                break;
        }
    }
//Описание_деятельности_ГК   	Решение_назначение ЕИО
}
