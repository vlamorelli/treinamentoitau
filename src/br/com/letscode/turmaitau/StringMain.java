package br.com.letscode.turmaitau;

import br.com.letscode.turmaitau.sequencialetra.Solucao;
import br.com.letscode.turmaitau.sequencialetra.SolucaoProfessor;

public class StringMain {

    public static void main(String[] args) {

        //String[] substring = {"hfgd", "fasdlkh", "poiwqd", "zxcqwtop", "qfghihl"};
        String[] substring = {"acbda", "fasdlkh", "poiwqd", "zxcqwtop", "qfgophl"};
        new Solucao().substring(substring);
        new SolucaoProfessor().substring(substring);

    }
}
