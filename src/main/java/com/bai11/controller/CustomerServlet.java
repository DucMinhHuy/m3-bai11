package com.bai11.controller;

import com.bai11.model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    private CustomerServlet customerServlet=new CustomerServlet();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }

        switch (action){
            case "create":
                break;
            case "edit":
                break;
            case "delete":
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                break;
            case "edit":
                break;
            case "detele":
                break;
            case "view":
                break;
            default:
                listCustomers(request,response);
                break;
        }
    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response) {
        List<Customer>customers=this.customerServlet.findAll();
        request.setAttribute("customers",customers);
        RequestDispatcher dispatcher=request.getRequestDispatcher("customerList.jsp");
        try{
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}