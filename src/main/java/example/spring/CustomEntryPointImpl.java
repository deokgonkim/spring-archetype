package example.spring;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

/**
 * This class is for the data clients, data clients doesn't use Login Form.
 * Data client authenticate via HTTP Basic Authentication.
 * @author dgkim@dgkim.net
 *
 */
public class CustomEntryPointImpl extends LoginUrlAuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        if (request.getHeader("X-Requested-With") != null && request.getHeader("X-Requested-With").equals("XMLHttpRequest")) {
            response.addHeader("WWW-Authenticate", "Basic realm=\"Default Realm\"");
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
        } else {
            super.commence(request, response, authException);
        }
    }

    @Override
    @Deprecated
    public void setLoginFormUrl(String loginFormUrl) {
        super.setLoginFormUrl(loginFormUrl);
    }
}
