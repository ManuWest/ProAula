package com.demo.demomaven.dao;

import java.util.List;

public interface DaoDeparment<Deparment> {
   void save(Deparment t);
   void update(Deparment t);
   List<Deparment> list();
   
   
   
}
