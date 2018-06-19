package ru.scorpio92.socketserver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ServerConfigStore {

    private static final String PROP_FILE_NAME = "server.properties";

    public static int SERVER_PORT;
    public static boolean LOGGER_ENABLED;

    static void init() throws IOException {
        Properties props = new Properties();
        InputStream in = SocketServer.class.getResourceAsStream("/" + PROP_FILE_NAME);
        props.load(in);

        SERVER_PORT = Integer.valueOf(props.getProperty("SERVER_PORT"));

        LOGGER_ENABLED = Boolean.valueOf(props.getProperty("LOGGER_ENABLED"));
    }
}
