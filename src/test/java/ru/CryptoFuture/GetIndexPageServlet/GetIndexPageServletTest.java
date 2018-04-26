package ru.CryptoFuture.GetIndexPageServlet;

import junit.framework.TestCase;
import org.junit.Test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class GetIndexPageServletTest extends TestCase {

    private final static String path = "/WEB-INF/view/index.jsp";

    @Test
    public void whenCallDoGetThenServletReturnIndexPage() throws ServletException, IOException {

        final GetIndexPageServlet servlet = new GetIndexPageServlet();

        final HttpServletRequest request = mock(HttpServletRequest.class);
        final HttpServletResponse response = mock(HttpServletResponse.class);
        final RequestDispatcher dispatcher = mock(RequestDispatcher.class);

        when(request.getRequestDispatcher(path)).thenReturn(dispatcher);

        servlet.doGet(request,response);

        verify(request, times(1)).getRequestDispatcher(path);
        verify(request, never()).getSession();
        verify(dispatcher).forward(request,response);

    }
}