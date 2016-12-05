package ru.job4j;

/**
*Class Calulate подключение сборщика Maven
*@autor Elena Domingos
*@since 12.04.2016
*/

public class Calculate {
    
/**
*@param value Строка для вывода в консоль
*@return String value
*/

    public String echo(String value) {
        
        return String.format("%s %s %s", value, value, value);
        
    }
    
    
public static void main(String[] args) {
    
Calculate calc = new Calculate();    
    
System.out.println(calc.echo("aah"));
    
}
}
