package br.com.randrade.annotation;

import java.lang.annotation.*;

//utilizado para incluir no javadoc
@Documented
//utilizado para indicar que a anotação estará disponível em tempo de execução
@Retention(RetentionPolicy.RUNTIME)
//utilizado para estabelecer em quais elementos da classe serão anotados
@Target({ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE})
public @interface Tabela {

    String value();

}
