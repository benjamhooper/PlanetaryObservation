# Planetary Observation Project - May 7, 2017
### Team Members:
    Colton Zimmerman
    Zachary Griffith
    Benjamin Hooper

### Project Description:
    Our project displays relevant information about our plants and stars in our solar system. 
    It includes pictures and categories of information about that planet/star.

### Responsibilities and Contributions of Each Team Member:
    ♦  Zachary Griffith:
            - Design of Planet classes and their relevant information from NASA\*
            - Design of GravitationalObject Class
            
    ♦ Colton Zimmerman
            - Design of PlanetaryObservation Class
            - Search Algorithm
            - Buttons
            - Stage 
            
    ♦ Benjamin Hooper
            - Design of PlanetaryObservation Class
            - Layout of Program (Stage, Panes, Vbox, Hbox)
            - Search Algorithm
            - Image error if not connected to internet
            - Design of Planet Classes
            - ImageView
### UML Class Design:

| GravitationalObject |
| --- |
| Name : StringMass : StringDiameter : StringDensity : StringTemp : String Image : String  |
| + GravitationalObject()+ toString() |

| Planet extends GravitationalObject |
| --- |
| LoD (Length of Day) : StringDfS (Distance from Sun) : StringNoM (Number of Moons) : StringOp (Orbital Period) : Stringrings : String |
| + Planet (mass, diameter, density, temp, LoD, DfS, NoM, Op)+ toString() |



| Mercury |
| --- |
|   |
| + Mercury (name, mass, diameter, density, temp, LoD, DfS, NoM, Op, rings, image) |

| theSun extends GravitationalObject |
| --- |
|   |
| + theSun(name, mass, diameter, density, temp, image) |



| Venus |
| --- |
|   |
| + Venus (name, mass, diameter, density, temp, LoD, DfS, NoM, Op, rings, image) |

| Earth |
| --- |
|   |
| + Earth (name, mass, diameter, density, temp, LoD, DfS, NoM, Op, rings, image) |

| Mars |
| --- |
|   |
| + Mars (name, mass, diameter, density, temp, LoD, DfS, NoM, Op, rings, image) |

| Jupiter |
| --- |
|   |
| + Jupiter (name, mass, diameter, density, temp, LoD, DfS, NoM, Op, rings, image) |



| Uranus |
| --- |
|   |
| + Uranus (name, mass, diameter, density, temp, LoD, DfS, NoM, Op, rings, image) |

| Saturn |
| --- |
|   |
| + Saturn (name, mass, diameter, density, temp, LoD, DfS, NoM, Op, rings, image) |

| Neptune |
| --- |
|   |
| + Neptune (name, mass, diameter, density, temp, LoD, DfS, NoM, Op, rings, image) |

| planetaryObservation |
| --- |
| Sun : SceneMercury : SceneVenus : SceneEarth: SceneMars: SceneJupiter: SceneSaturn: SceneUranus: SceneNeptune: SceneImage : ImageImageView : imageviewmainScene : Sceneex : ExceptionplanetStrings : String[]planetScenes : ArrayList&lt;Scene&gt;actionMenu : VBoxtfSearch : TextFieldlbError : Label |
| + Start()+ main(launcher)  + sceneChange() |

### Screenshots:

Main Scene: 

![](/resources/main.jpg)

Info Section:

![](/resources/search.jpg)


#### References
  [https://nssdc.gsfc.nasa.gov/planetary/factsheet/](https://nssdc.gsfc.nasa.gov/planetary/factsheet/)

| | ** ** [**MERCURY**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/mercuryfact.html) ** ** | ** ** [**VENUS**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/venusfact.html) ** ** | ** ** [**EARTH**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/earthfact.html) ** ** | ** ** [**MOON**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/moonfact.html) ** ** | ** ** [**MARS**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/marsfact.html) ** ** | ** ** [**JUPITER**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/jupiterfact.html) ** ** | ** ** [**SATURN**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/saturnfact.html) ** ** | ** ** [**URANUS**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/uranusfact.html) ** ** | ** ** [**NEPTUNE**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/neptunefact.html) ** ** | ** ** [**PLUTO**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/plutofact.html) ** ** |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| [**Mass**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#mass)** (10****24****kg)** | 0.330 | 4.87 | 5.97 | 0.073 | 0.642 | 1898 | 568 | 86.8 | 102 | 0.0146 |
| [**Diameter**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#diam)** (km)** | 4879 | 12,104 | 12,756 | 3475 | 6792 | 142,984 | 120,536 | 51,118 | 49,528 | 2370 |
| [**Density**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#dens)** (kg/m****3****)** | 5427 | 5243 | 5514 | 3340 | 3933 | 1326 | 687 | 1271 | 1638 | 2095 |
| [**Gravity**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#grav)** (m/s****2****)** | 3.7 | 8.9 | 9.8 | 1.6 | 3.7 | 23.1 | 9.0 | 8.7 | 11.0 | 0.7 |
| [**Escape Velocity**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#escv)** (km/s)** | 4.3 | 10.4 | 11.2 | 2.4 | 5.0 | 59.5 | 35.5 | 21.3 | 23.5 | 1.3 |
| [**Rotation Period**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#rotp)** (hours)** | 1407.6 | -5832.5 | 23.9 | 655.7 | 24.6 | 9.9 | 10.7 | -17.2 | 16.1 | -153.3 |
| [**Length of Day**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#leng)** (hours)** | 4222.6 | 2802.0 | 24.0 | 708.7 | 24.7 | 9.9 | 10.7 | 17.2 | 16.1 | 153.3 |
| [**Distance from Sun**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#dist)** (10****6**** km)** | 57.9 | 108.2 | 149.6 | 0.384\* | 227.9 | 778.6 | 1433.5 | 2872.5 | 4495.1 | 5906.4 |
| [**Perihelion**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#peri)** (10****6**** km)** | 46.0 | 107.5 | 147.1 | 0.363\* | 206.6 | 740.5 | 1352.6 | 2741.3 | 4444.5 | 4436.8 |
| [**Aphelion**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#peri)** (10****6**** km)** | 69.8 | 108.9 | 152.1 | 0.406\* | 249.2 | 816.6 | 1514.5 | 3003.6 | 4545.7 | 7375.9 |
| [**Orbital Period**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#orbp)** (days)** | 88.0 | 224.7 | 365.2 | 27.3 | 687.0 | 4331 | 10,747 | 30,589 | 59,800 | 90,560 |
| [**Orbital Velocity**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#orbv)** (km/s)** | 47.4 | 35.0 | 29.8 | 1.0 | 24.1 | 13.1 | 9.7 | 6.8 | 5.4 | 4.7 |
| [**Orbital Inclination**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#orbi)** (degrees)** | 7.0 | 3.4 | 0.0 | 5.1 | 1.9 | 1.3 | 2.5 | 0.8 | 1.8 | 17.2 |
| [**Orbital Eccentricity**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#orbe) | 0.205 | 0.007 | 0.017 | 0.055 | 0.094 | 0.049 | 0.057 | 0.046 | 0.011 | 0.244 |
| [**Obliquity to Orbit**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#orbo)** (degrees)** | 0.01 | 177.4 | 23.4 | 6.7 | 25.2 | 3.1 | 26.7 | 97.8 | 28.3 | 122.5 |
| [**Mean Temperature**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#temp)** (C)** | 167 | 464 | 15 | -20 | -65 | -110 | -140 | -195 | -200 | -225 |
| [**Surface Pressure**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#surp)** (bars)** | 0 | 92 | 1 | 0 | 0.01 | Unknown\* | Unknown\* | Unknown\* | Unknown\* | 0.00001 |
| [**Number of Moons**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#sats) | 0 | 0 | 1 | 0 | 2 | 67 | 62 | 27 | 14 | 5 |
| [**Ring System?**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#ring) | No | No | No | No | No | Yes | Yes | Yes | Yes | No |
| [**Global Magnetic Field?**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/planetfact_notes.html#magf) | Yes | No | Yes | No | No | Yes | Yes | Yes | Yes | Unknown |
| | ** ** [**MERCURY**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/mercuryfact.html) ** ** | ** ** [**VENUS**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/venusfact.html) ** ** | ** ** [**EARTH**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/earthfact.html) ** ** | ** ** [**MOON**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/moonfact.html) ** ** | ** ** [**MARS**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/marsfact.html) ** ** | ** ** [**JUPITER**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/jupiterfact.html) ** ** | ** ** [**SATURN**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/saturnfact.html) ** ** | ** ** [**URANUS**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/uranusfact.html) ** ** | ** ** [**NEPTUNE**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/neptunefact.html) ** ** | ** ** [**PLUTO**](https://nssdc.gsfc.nasa.gov/planetary/factsheet/plutofact.html) ** ** |

#### Title Page:

[http://s3.amazonaws.com/kidzworld\_photo/images/201562/a9a18f6f-6299-4184-b597-1360552d05b7/planet-names.jpg](http://s3.amazonaws.com/kidzworld_photo/images/201562/a9a18f6f-6299-4184-b597-1360552d05b7/planet-names.jpg)

#### Planets:

Mercury:

[https://www.nasa.gov/images/content/606988main\_messenger\_orbit\_image20111129\_1\_4by3\_800-600.jpg](https://www.nasa.gov/images/content/606988main_messenger_orbit_image20111129_1_4by3_800-600.jpg)

Venus:

[http://techcrash.net/wp-content/uploads/2012/12/14181\_Venus-a-800x600.jpg](http://techcrash.net/wp-content/uploads/2012/12/14181_Venus-a-800x600.jpg)

Earth:

[http://www.nannygoatsinpanties.com/wp-content/uploads/2011/04/nasa-earth-800x600.jpg](http://www.nannygoatsinpanties.com/wp-content/uploads/2011/04/nasa-earth-800x600.jpg)

Mars:

[http://www.spacedaily.com/images/mars-hubble-2003-desk-800.jpg](http://www.spacedaily.com/images/mars-hubble-2003-desk-800.jpg)

Jupiter:

[https://www.wwu.edu/skywise/wallpaper/jupiter\_800x600.jpg](https://www.wwu.edu/skywise/wallpaper/jupiter_800x600.jpg)

Saturn:

[http://saturnc.com/interactive/media/Saturn-Fleeing-800.jpg](http://saturnc.com/interactive/media/Saturn-Fleeing-800.jpg)

Uranus:

[http://www.starstrider.com/img/scr/Uranus.jpg](http://www.starstrider.com/img/scr/Uranus.jpg)

Neptune:

[https://www.jpl.nasa.gov/spaceimages/images/wallpaper/PIA02210-800x600.jpg](https://www.jpl.nasa.gov/spaceimages/images/wallpaper/PIA02210-800x600.jpg)

**Stars** :

The Sun:

[https://www.nasa.gov/sites/default/files/styles/800x600\_autoletterbox/public/images/469368main\_sun\_layers\_unlabeled\_full.jpg?itok=wHpKhSrn](https://www.nasa.gov/sites/default/files/styles/800x600_autoletterbox/public/images/469368main_sun_layers_unlabeled_full.jpg?itok=wHpKhSrn)

VY Canis Majoris:

[https://blogs.aalto.fi/avotw/files/2014/03/605601\_A-diagram-comparing-the-Sun-to-VY-Canis-Majoris.jpg](https://blogs.aalto.fi/avotw/files/2014/03/605601_A-diagram-comparing-the-Sun-to-VY-Canis-Majoris.jpg)

**Error Image:**

[https://www.bvp.com/sites/default/files/strategy-index/46/46\_index.png](https://www.bvp.com/sites/default/files/strategy-index/46/46_index.png)

**JavaDoc**
  
    Located in Submission Folder – javadoc/index.html