package ru.scorpio92.socketserver;

import ru.scorpio92.socketserver.tools.Logger;

/**
 * Основной класс
 */
public class SocketServer {

    public static void main(String[] args) throws Throwable {

        //инициализация глобального конфига
        ServerConfigStore.init();
        Logger.log("ServerConfigStore init complete");
    }
}
