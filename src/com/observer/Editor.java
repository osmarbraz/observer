package com.observer;

import java.io.File;

/**
 * Publicador concreto, rastreado por outros objetos.
 * 
 * O publicador concreto contém a verdadeira lógica de negócio
 * que é de interesse para alguns assinantes. Nós podemos
 * derivar essa classe a partir do publicador base, mas isso nem
 * sempre é possível na vida real devido a possibilidade do
 * publicador concreto já ser uma subclasse. Neste caso, você
 * pode remendar a lógica de inscrição com a composição, como
 * fizemos aqui.
 */
public class Editor {

    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("abrir", "salvar");
    }

    /** 
     * Métodos da lógica de negócio podem notificar assinantes
     * acerca de mudanças.
     */
    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("abrir", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("salvar", file);
        } else {
            throw new Exception("Por favor abra o arquivo primeiro.");
        }
    }
}
