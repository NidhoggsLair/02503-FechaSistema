/* 
 * Copyright 2020 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Date;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static void main(String[] args) {

        Date d = new Date();

//      Si bien %tD muestra la fecha actual lo hace en formato mm/dd/aa por lo
//      que necesitamos utilizar %td/%tm/%ty para que la fecha se 
//      represente dd/mm/aaaa, el año al mostrarse como aa necesitaremos 
//      utilizar %tY para que se muestre aaaa 
        System.out.printf("Fecha del sistema ...: %td/%tm/%tY %n",d,d,d);
    }

}
