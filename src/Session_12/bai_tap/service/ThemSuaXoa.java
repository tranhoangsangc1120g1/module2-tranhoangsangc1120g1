package Session_12.bai_tap.service;

import Session_12.bai_tap.Models.Product;

import java.util.List;

public interface ThemSuaXoa {
    public void add(List<Product> list);
    public void display(List<Product> list);
    public void delet(List<Product> list , int id);
    public void edit(List<Product> list, int id);
}
