import fontforge
import os
from pathlib import Path

font = fontforge.open(os.sys.argv[1])
folder = ".\\" + Path(os.sys.argv[1]).stem + "\\"
if not os.path.exists(folder):
    os.makedirs(folder)
    
for name in font:
    glyph = font[name]
    if glyph.isWorthOutputting():        
        fullnamepng = name + " , " + str(glyph.unicode) + " , " + str(glyph.altuni) + ".png"
        glyph.export(folder + fullnamepng, 48)