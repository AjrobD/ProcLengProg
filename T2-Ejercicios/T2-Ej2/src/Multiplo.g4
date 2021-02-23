grammar Multiplo;
r: ((INT)+|(OTHER)+)+;
INT: [0-9]+{if(Integer.parseInt(getText())%3==0){System.out.print(Integer.parseInt(getText())+5);} else{System.out.print(Integer.parseInt(getText()));}};
OTHER : .{System.out.print(getText());};