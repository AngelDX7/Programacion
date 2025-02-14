package Tema3.Strings.cifrado;

public class decrypt {
    public static String descifrador (String usuario){
        char [] abecedario = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char [] numeros = {'0','1','2','3','4','5','6','7','8','9'};
        String resultadofinal1;
        char [] usuariochar = usuario.toCharArray();
        int resultadofinalnumero = usuario.length();
        char[] resultadofinal = new char[resultadofinalnumero];
        int contador = 0;
        for (int j = 0; j < usuariochar.length; j++){ /*for(char c : usuariochar)*/
            if (Character.isLetter(usuariochar[j])) {
                if (usuariochar[j]=='a'){
                    contador++;
                    resultadofinal[contador]  = 'z';
                    break;}
                for (int i = 0; i < abecedario.length; i++) {
                    if (abecedario[i] == usuariochar[j]) {
                        contador++;
                        resultadofinal[contador] = abecedario[i - 1];
                    }
                }
            }if (Character.isDigit(usuariochar[j])){
                if (usuariochar[j]=='0'){
                    contador++;
                    resultadofinal[contador]  = '9';
                    break;
                }
                for (int i = 0; i<numeros.length; i++) {
                    if (numeros[i]==usuariochar[j]){
                        contador++;
                        resultadofinal[contador]  = numeros[i-1];
                    }
                }
            } if (Character.isWhitespace(usuariochar[j])) {
                contador++;
                resultadofinal[contador]  = ' ';
            } else {
                contador++;
            }


        }
        resultadofinal1 = resultadofinal.toString();
        return  resultadofinal1;
    }
}
