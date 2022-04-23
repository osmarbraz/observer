package com.observer;

import java.io.File;

/**
 * Escreve uma mensagem em um registro ao receber uma notificação.
 * 
 * Assinantes concretos reagem a atualizações emitidas pelo
 * publicador a qual elas estão conectadas.
 */
public class LogOpenListener implements EventListener {

    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Salvar para log " + log + ": Alguém realizou " + eventType + " operação com o seguinte arquivo: " + file.getName());
    }
}
