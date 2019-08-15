import java.util.ArrayList;
import java.util.Collections;

public class Emoji {
    private ArrayList<String> aImages;
    private ArrayList<String> bImages;
    private ArrayList<String> cImages;
    private ArrayList<String> dImages;
    private ArrayList<String> eImages;
    private ArrayList<String> fImages;
    private ArrayList<String> gImages;
    private ArrayList<String> hImages;
    private ArrayList<String> iImages;
    private ArrayList<String> jImages;
    private ArrayList<String> kImages;
    private ArrayList<String> lImages;
    private ArrayList<String> mImages;
    private ArrayList<String> nImages;
    private ArrayList<String> oImages;
    private ArrayList<String> pImages;
    private ArrayList<String> qImages;
    private ArrayList<String> rImages;
    private ArrayList<String> sImages;
    private ArrayList<String> tImages;
    private ArrayList<String> uImages;
    private ArrayList<String> vImages;
    private ArrayList<String> wImages;
    private ArrayList<String> xImages;
    private ArrayList<String> yImages;
    private ArrayList<String> zImages;


    public Emoji() {
        aImages = new ArrayList<>();
        fillAImages();

        bImages = new ArrayList<>();
        fillBImages();

        cImages = new ArrayList<>();
        fillCImages();

        dImages = new ArrayList<>();
        fillDImages();

        eImages = new ArrayList<>();
        fillEImages();

        fImages = new ArrayList<>();
        fillFImages();

        gImages = new ArrayList<>();
        fillGImages();

        hImages = new ArrayList<>();
        fillHImages();

        iImages = new ArrayList<>();
        fillIImages();

        jImages = new ArrayList<>();
        fillJImages();

        kImages = new ArrayList<>();
        fillKImages();

        lImages = new ArrayList<>();
        fillLImages();

        mImages = new ArrayList<>();
        fillMImages();

        nImages = new ArrayList<>();
        fillNImages();

        oImages = new ArrayList<>();
        fillOImages();

        pImages = new ArrayList<>();
        fillPImages();

        qImages = new ArrayList<>();
        fillQImages();

        rImages = new ArrayList<>();
        fillRImages();

        sImages = new ArrayList<>();
        fillSImages();

        tImages = new ArrayList<>();
        fillTImages();

        uImages = new ArrayList<>();
        fillUImages();

        vImages = new ArrayList<>();
        fillVImages();

        wImages = new ArrayList<>();
        fillWImages();

        xImages = new ArrayList<>();
        fillXImages();

        yImages = new ArrayList<>();
        fillYImages();

        zImages = new ArrayList<>();
        fillZImages();
    }

    public String getImage(char c) {
        if (c == 'a') {
            Collections.shuffle(aImages);
            return aImages.get(0);
        } else if(c == 'b') {
            Collections.shuffle(bImages);
            return bImages.get(0);
        } else if(c == 'c') {
            Collections.shuffle(cImages);
            return cImages.get(0);
        } else if(c == 'd') {
            Collections.shuffle(dImages);
            return dImages.get(0);
        } else if(c == 'e') {
            Collections.shuffle(eImages);
            return eImages.get(0);
        } else if(c == 'f') {
            Collections.shuffle(fImages);
            return fImages.get(0);
        } else if(c == 'g') {
            Collections.shuffle(gImages);
            return gImages.get(0);
        } else if(c == 'h') {
            Collections.shuffle(hImages);
            return hImages.get(0);
        } else if(c == 'i') {
            Collections.shuffle(iImages);
            return iImages.get(0);
        } else if(c == 'j') {
            Collections.shuffle(jImages);
            return jImages.get(0);
        } else if(c == 'k') {
            Collections.shuffle(kImages);
            return kImages.get(0);
        } else if(c == 'l') {
            Collections.shuffle(lImages);
            return lImages.get(0);
        } else if(c == 'm') {
            Collections.shuffle(mImages);
            return mImages.get(0);
        } else if(c == 'n') {
            Collections.shuffle(nImages);
            return nImages.get(0);
        } else if(c == 'o') {
            Collections.shuffle(oImages);
            return oImages.get(0);
        } else if(c == 'p') {
            Collections.shuffle(pImages);
            return pImages.get(0);
        } else if(c == 'q') {
            Collections.shuffle(qImages);
            return qImages.get(0);
        } else if(c == 'r') {
            Collections.shuffle(rImages);
            return rImages.get(0);
        } else if(c == 's') {
            Collections.shuffle(sImages);
            return sImages.get(0);
        } else if(c == 't') {
            Collections.shuffle(tImages);
            return tImages.get(0);
        } else if(c == 'u') {
            Collections.shuffle(uImages);
            return uImages.get(0);
        } else if(c == 'v') {
            Collections.shuffle(vImages);
            return vImages.get(0);
        } else if(c == 'w') {
            Collections.shuffle(wImages);
            return wImages.get(0);
        } else if(c == 'x') {
            Collections.shuffle(xImages);
            return xImages.get(0);
        } else if(c == 'y') {
            Collections.shuffle(yImages);
            return yImages.get(0);
        } else if(c == 'z') {
            Collections.shuffle(zImages);
            return zImages.get(0);
        }
        return "Images\\smileEmoji.png";
    }

    public void fillAImages() {
        aImages.add("Images\\aImage1.png");
    }

    public void fillBImages() {
        bImages.add("Images\\bImage1.png");
    }

    public void fillCImages() {
        cImages.add("Images\\cImage1.png");
    }

    public void fillDImages() {
        dImages.add("Images\\dImage1.png");
    }

    public void fillEImages() {
        eImages.add("Images\\eImage1.png");
        eImages.add("Images\\eImage2.png");
        eImages.add("Images\\eImage3.png");
        eImages.add("Images\\eImage4.png");
    }

    public void fillFImages() {
        fImages.add("Images\\fImage1.png");
        fImages.add("Images\\fImage2.png");
    }

    public void fillGImages() {
        gImages.add("Images\\gImage1.png");
    }

    public void fillHImages() {
        hImages.add("Images\\hImage1.png");
    }

    public void fillIImages() {
        iImages.add("Images\\iImage1.png");
        iImages.add("Images\\iImage2.png");
    }

    public void fillJImages() {
        jImages.add("Images\\jImage1.png");
    }

    public void fillKImages() {
        kImages.add("Images\\kImage1.png");
    }

    public void fillLImages() {
        lImages.add("Images\\lImage1.png");
        lImages.add("Images\\lImage2.png");
        lImages.add("Images\\lImage3.png");
        lImages.add("Images\\lImage4.png");
    }

    public void fillMImages() {
        mImages.add("Images\\mImage1.png");
        mImages.add("Images\\mImage2.png");
        mImages.add("Images\\mImage3.png");
    }

    public void fillNImages() {
        nImages.add("Images\\nImage1.png");
        nImages.add("Images\\nImage2.png");
        nImages.add("Images\\nImage3.png");
    }

    public void fillOImages() {
        oImages.add("Images\\oImage1.png");
        oImages.add("Images\\oImage2.png");
        oImages.add("Images\\oImage3.png");
    }

    public void fillPImages() {
        pImages.add("Images\\pImage1.png");
    }

    public void fillQImages() {
        qImages.add("Images\\qImage1.png");
    }

    public void fillRImages() {
        rImages.add("Images\\rImage1.png");
    }

    public void fillSImages() {
        sImages.add("Images\\sImage1.png");
    }

    public void fillTImages() {
        tImages.add("Images\\tImage1.png");
        tImages.add("Images\\tImage2.png");
    }

    public void fillUImages() {
        uImages.add("Images\\uImage1.png");
    }

    public void fillVImages() {
        vImages.add("Images\\vImage1.png");
    }

    public void fillWImages() {
        wImages.add("Images\\wImage1.png");
    }

    public void fillXImages() {
        xImages.add("Images\\xImage1.png");
        xImages.add("Images\\xImage2.png");
        xImages.add("Images\\xImage3.png");
    }


    public void fillYImages() {
        yImages.add("Images\\yImage1.png");
    }

    public void fillZImages() {
        zImages.add("Images\\zImage1.png");
    }
}
