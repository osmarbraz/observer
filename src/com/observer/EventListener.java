package com.observer;

import java.io.File;

/**
 * Interface comum do observador.
 * 
 * Aqui é a interface do assinante. Se sua linguagem de
 * programação suporta tipos funcionais, você pode substituir
 * toda a hierarquia do assinante por um conjunto de funções.
 */
public interface EventListener {

    void update(String eventType, File file);

}
