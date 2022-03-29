fun main()
{
   println("Ingresa una hora: entre 0 a 23 hrs: ");
   val hora= readLine()?.toInt();
   if (hora != null) {
      if ((hora >=  6 ) && (hora <=  12 )) {
         println( " buenos dias " );
      }
   }
   if (hora != null) {
      if ((hora >=  13 ) && (hora <=  20 )) {
         println( " Buenas tardes " );
      }
   }
   if (hora != null) {
      if (((hora >=  21 ) && (hora <  24 )) || ((hora <=  5 ) && (hora >=  0 ))) {
         println( " Buenas noches " );
      }
   }
   if (hora != null) {
      if ((hora >=  24 ) || (hora <  0 )) {
         println( " La hora necesaria no es correcta. " );
      }
   }
}