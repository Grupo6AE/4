import com.servicios.UsuarioBeanRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClienteMiniProyecto {

    public static void main(String[] args) {

        try {
            java.util.Properties jndiProps = new java.util.Properties();
            jndiProps.put(Context.INITIAL_CONTEXT_FACTORY, "org.widfly.naming.client .WidflyInitialContextFactory");
            jndiProps.put(Context.PROVIDER_URL,
                    "http-remoting://localhost:8080");

            Context context = new InitialContext(jndiProps);
            context.lookup
                    ("ejb:/MiniProyecto-1.0-SNAPSHOT/UsuariBean!com.servicios.UsuarioBeanRemote");

        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}