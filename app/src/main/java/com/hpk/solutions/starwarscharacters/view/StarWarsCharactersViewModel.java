package com.hpk.solutions.starwarscharacters.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hpk.solutions.starwarscharacters.model.Character;

import java.lang.reflect.Type;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by jgugala on 2018-01-08.
 */

public class StarWarsCharactersViewModel {

    private static final String API_RESPONE = "[\n" +
            "  {\n" +
            "    \"name\": \"Luke Skywalker\",\n" +
            "    \"height\": \"172\",\n" +
            "    \"mass\": \"77\",\n" +
            "    \"hair_color\": \"blond\",\n" +
            "    \"skin_color\": \"fair\",\n" +
            "    \"eye_color\": \"blue\",\n" +
            "    \"birth_year\": \"19BBY\",\n" +
            "    \"gender\": \"male\",\n" +
            "    \"homeworld\": \"https://swapi.co/api/planets/1/\",\n" +
            "    \"films\": [\n" +
            "      \"https://swapi.co/api/films/2/\",\n" +
            "      \"https://swapi.co/api/films/6/\",\n" +
            "      \"https://swapi.co/api/films/3/\",\n" +
            "      \"https://swapi.co/api/films/1/\",\n" +
            "      \"https://swapi.co/api/films/7/\"\n" +
            "    ],\n" +
            "    \"species\": [\n" +
            "      \"https://swapi.co/api/species/1/\"\n" +
            "    ],\n" +
            "    \"vehicles\": [\n" +
            "      \"https://swapi.co/api/vehicles/14/\",\n" +
            "      \"https://swapi.co/api/vehicles/30/\"\n" +
            "    ],\n" +
            "    \"starships\": [\n" +
            "      \"https://swapi.co/api/starships/12/\",\n" +
            "      \"https://swapi.co/api/starships/22/\"\n" +
            "    ],\n" +
            "    \"created\": \"2014-12-09T13:50:51.644000Z\",\n" +
            "    \"edited\": \"2014-12-20T21:17:56.891000Z\",\n" +
            "    \"url\": \"https://swapi.co/api/people/1/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"C-3PO\",\n" +
            "    \"height\": \"167\",\n" +
            "    \"mass\": \"75\",\n" +
            "    \"hair_color\": \"n/a\",\n" +
            "    \"skin_color\": \"gold\",\n" +
            "    \"eye_color\": \"yellow\",\n" +
            "    \"birth_year\": \"112BBY\",\n" +
            "    \"gender\": \"n/a\",\n" +
            "    \"homeworld\": \"https://swapi.co/api/planets/1/\",\n" +
            "    \"films\": [\n" +
            "      \"https://swapi.co/api/films/2/\",\n" +
            "      \"https://swapi.co/api/films/5/\",\n" +
            "      \"https://swapi.co/api/films/4/\",\n" +
            "      \"https://swapi.co/api/films/6/\",\n" +
            "      \"https://swapi.co/api/films/3/\",\n" +
            "      \"https://swapi.co/api/films/1/\"\n" +
            "    ],\n" +
            "    \"species\": [\n" +
            "      \"https://swapi.co/api/species/2/\"\n" +
            "    ],\n" +
            "    \"vehicles\": [],\n" +
            "    \"starships\": [],\n" +
            "    \"created\": \"2014-12-10T15:10:51.357000Z\",\n" +
            "    \"edited\": \"2014-12-20T21:17:50.309000Z\",\n" +
            "    \"url\": \"https://swapi.co/api/people/2/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"R2-D2\",\n" +
            "    \"height\": \"96\",\n" +
            "    \"mass\": \"32\",\n" +
            "    \"hair_color\": \"n/a\",\n" +
            "    \"skin_color\": \"white, blue\",\n" +
            "    \"eye_color\": \"red\",\n" +
            "    \"birth_year\": \"33BBY\",\n" +
            "    \"gender\": \"n/a\",\n" +
            "    \"homeworld\": \"https://swapi.co/api/planets/8/\",\n" +
            "    \"films\": [\n" +
            "      \"https://swapi.co/api/films/2/\",\n" +
            "      \"https://swapi.co/api/films/5/\",\n" +
            "      \"https://swapi.co/api/films/4/\",\n" +
            "      \"https://swapi.co/api/films/6/\",\n" +
            "      \"https://swapi.co/api/films/3/\",\n" +
            "      \"https://swapi.co/api/films/1/\",\n" +
            "      \"https://swapi.co/api/films/7/\"\n" +
            "    ],\n" +
            "    \"species\": [\n" +
            "      \"https://swapi.co/api/species/2/\"\n" +
            "    ],\n" +
            "    \"vehicles\": [],\n" +
            "    \"starships\": [],\n" +
            "    \"created\": \"2014-12-10T15:11:50.376000Z\",\n" +
            "    \"edited\": \"2014-12-20T21:17:50.311000Z\",\n" +
            "    \"url\": \"https://swapi.co/api/people/3/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"Darth Vader\",\n" +
            "    \"height\": \"202\",\n" +
            "    \"mass\": \"136\",\n" +
            "    \"hair_color\": \"none\",\n" +
            "    \"skin_color\": \"white\",\n" +
            "    \"eye_color\": \"yellow\",\n" +
            "    \"birth_year\": \"41.9BBY\",\n" +
            "    \"gender\": \"male\",\n" +
            "    \"homeworld\": \"https://swapi.co/api/planets/1/\",\n" +
            "    \"films\": [\n" +
            "      \"https://swapi.co/api/films/2/\",\n" +
            "      \"https://swapi.co/api/films/6/\",\n" +
            "      \"https://swapi.co/api/films/3/\",\n" +
            "      \"https://swapi.co/api/films/1/\"\n" +
            "    ],\n" +
            "    \"species\": [\n" +
            "      \"https://swapi.co/api/species/1/\"\n" +
            "    ],\n" +
            "    \"vehicles\": [],\n" +
            "    \"starships\": [\n" +
            "      \"https://swapi.co/api/starships/13/\"\n" +
            "    ],\n" +
            "    \"created\": \"2014-12-10T15:18:20.704000Z\",\n" +
            "    \"edited\": \"2014-12-20T21:17:50.313000Z\",\n" +
            "    \"url\": \"https://swapi.co/api/people/4/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"Leia Organa\",\n" +
            "    \"height\": \"150\",\n" +
            "    \"mass\": \"49\",\n" +
            "    \"hair_color\": \"brown\",\n" +
            "    \"skin_color\": \"light\",\n" +
            "    \"eye_color\": \"brown\",\n" +
            "    \"birth_year\": \"19BBY\",\n" +
            "    \"gender\": \"female\",\n" +
            "    \"homeworld\": \"https://swapi.co/api/planets/2/\",\n" +
            "    \"films\": [\n" +
            "      \"https://swapi.co/api/films/2/\",\n" +
            "      \"https://swapi.co/api/films/6/\",\n" +
            "      \"https://swapi.co/api/films/3/\",\n" +
            "      \"https://swapi.co/api/films/1/\",\n" +
            "      \"https://swapi.co/api/films/7/\"\n" +
            "    ],\n" +
            "    \"species\": [\n" +
            "      \"https://swapi.co/api/species/1/\"\n" +
            "    ],\n" +
            "    \"vehicles\": [\n" +
            "      \"https://swapi.co/api/vehicles/30/\"\n" +
            "    ],\n" +
            "    \"starships\": [],\n" +
            "    \"created\": \"2014-12-10T15:20:09.791000Z\",\n" +
            "    \"edited\": \"2014-12-20T21:17:50.315000Z\",\n" +
            "    \"url\": \"https://swapi.co/api/people/5/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"Owen Lars\",\n" +
            "    \"height\": \"178\",\n" +
            "    \"mass\": \"120\",\n" +
            "    \"hair_color\": \"brown, grey\",\n" +
            "    \"skin_color\": \"light\",\n" +
            "    \"eye_color\": \"blue\",\n" +
            "    \"birth_year\": \"52BBY\",\n" +
            "    \"gender\": \"male\",\n" +
            "    \"homeworld\": \"https://swapi.co/api/planets/1/\",\n" +
            "    \"films\": [\n" +
            "      \"https://swapi.co/api/films/5/\",\n" +
            "      \"https://swapi.co/api/films/6/\",\n" +
            "      \"https://swapi.co/api/films/1/\"\n" +
            "    ],\n" +
            "    \"species\": [\n" +
            "      \"https://swapi.co/api/species/1/\"\n" +
            "    ],\n" +
            "    \"vehicles\": [],\n" +
            "    \"starships\": [],\n" +
            "    \"created\": \"2014-12-10T15:52:14.024000Z\",\n" +
            "    \"edited\": \"2014-12-20T21:17:50.317000Z\",\n" +
            "    \"url\": \"https://swapi.co/api/people/6/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"Beru Whitesun lars\",\n" +
            "    \"height\": \"165\",\n" +
            "    \"mass\": \"75\",\n" +
            "    \"hair_color\": \"brown\",\n" +
            "    \"skin_color\": \"light\",\n" +
            "    \"eye_color\": \"blue\",\n" +
            "    \"birth_year\": \"47BBY\",\n" +
            "    \"gender\": \"female\",\n" +
            "    \"homeworld\": \"https://swapi.co/api/planets/1/\",\n" +
            "    \"films\": [\n" +
            "      \"https://swapi.co/api/films/5/\",\n" +
            "      \"https://swapi.co/api/films/6/\",\n" +
            "      \"https://swapi.co/api/films/1/\"\n" +
            "    ],\n" +
            "    \"species\": [\n" +
            "      \"https://swapi.co/api/species/1/\"\n" +
            "    ],\n" +
            "    \"vehicles\": [],\n" +
            "    \"starships\": [],\n" +
            "    \"created\": \"2014-12-10T15:53:41.121000Z\",\n" +
            "    \"edited\": \"2014-12-20T21:17:50.319000Z\",\n" +
            "    \"url\": \"https://swapi.co/api/people/7/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"R5-D4\",\n" +
            "    \"height\": \"97\",\n" +
            "    \"mass\": \"32\",\n" +
            "    \"hair_color\": \"n/a\",\n" +
            "    \"skin_color\": \"white, red\",\n" +
            "    \"eye_color\": \"red\",\n" +
            "    \"birth_year\": \"unknown\",\n" +
            "    \"gender\": \"n/a\",\n" +
            "    \"homeworld\": \"https://swapi.co/api/planets/1/\",\n" +
            "    \"films\": [\n" +
            "      \"https://swapi.co/api/films/1/\"\n" +
            "    ],\n" +
            "    \"species\": [\n" +
            "      \"https://swapi.co/api/species/2/\"\n" +
            "    ],\n" +
            "    \"vehicles\": [],\n" +
            "    \"starships\": [],\n" +
            "    \"created\": \"2014-12-10T15:57:50.959000Z\",\n" +
            "    \"edited\": \"2014-12-20T21:17:50.321000Z\",\n" +
            "    \"url\": \"https://swapi.co/api/people/8/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"Biggs Darklighter\",\n" +
            "    \"height\": \"183\",\n" +
            "    \"mass\": \"84\",\n" +
            "    \"hair_color\": \"black\",\n" +
            "    \"skin_color\": \"light\",\n" +
            "    \"eye_color\": \"brown\",\n" +
            "    \"birth_year\": \"24BBY\",\n" +
            "    \"gender\": \"male\",\n" +
            "    \"homeworld\": \"https://swapi.co/api/planets/1/\",\n" +
            "    \"films\": [\n" +
            "      \"https://swapi.co/api/films/1/\"\n" +
            "    ],\n" +
            "    \"species\": [\n" +
            "      \"https://swapi.co/api/species/1/\"\n" +
            "    ],\n" +
            "    \"vehicles\": [],\n" +
            "    \"starships\": [\n" +
            "      \"https://swapi.co/api/starships/12/\"\n" +
            "    ],\n" +
            "    \"created\": \"2014-12-10T15:59:50.509000Z\",\n" +
            "    \"edited\": \"2014-12-20T21:17:50.323000Z\",\n" +
            "    \"url\": \"https://swapi.co/api/people/9/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\": \"Obi-Wan Kenobi\",\n" +
            "    \"height\": \"182\",\n" +
            "    \"mass\": \"77\",\n" +
            "    \"hair_color\": \"auburn, white\",\n" +
            "    \"skin_color\": \"fair\",\n" +
            "    \"eye_color\": \"blue-gray\",\n" +
            "    \"birth_year\": \"57BBY\",\n" +
            "    \"gender\": \"male\",\n" +
            "    \"homeworld\": \"https://swapi.co/api/planets/20/\",\n" +
            "    \"films\": [\n" +
            "      \"https://swapi.co/api/films/2/\",\n" +
            "      \"https://swapi.co/api/films/5/\",\n" +
            "      \"https://swapi.co/api/films/4/\",\n" +
            "      \"https://swapi.co/api/films/6/\",\n" +
            "      \"https://swapi.co/api/films/3/\",\n" +
            "      \"https://swapi.co/api/films/1/\"\n" +
            "    ],\n" +
            "    \"species\": [\n" +
            "      \"https://swapi.co/api/species/1/\"\n" +
            "    ],\n" +
            "    \"vehicles\": [\n" +
            "      \"https://swapi.co/api/vehicles/38/\"\n" +
            "    ],\n" +
            "    \"starships\": [\n" +
            "      \"https://swapi.co/api/starships/48/\",\n" +
            "      \"https://swapi.co/api/starships/59/\",\n" +
            "      \"https://swapi.co/api/starships/64/\",\n" +
            "      \"https://swapi.co/api/starships/65/\",\n" +
            "      \"https://swapi.co/api/starships/74/\"\n" +
            "    ],\n" +
            "    \"created\": \"2014-12-10T16:16:29.192000Z\",\n" +
            "    \"edited\": \"2014-12-20T21:17:50.325000Z\",\n" +
            "    \"url\": \"https://swapi.co/api/people/10/\"\n" +
            "  },\n" +
            "  {\n" +
            "\t\t\t\"name\": \"Anakin Skywalker\",\n" +
            "\t\t\t\"height\": \"188\",\n" +
            "\t\t\t\"mass\": \"84\",\n" +
            "\t\t\t\"hair_color\": \"blond\",\n" +
            "\t\t\t\"skin_color\": \"fair\",\n" +
            "\t\t\t\"eye_color\": \"blue\",\n" +
            "\t\t\t\"birth_year\": \"41.9BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/1/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/5/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/4/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/6/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/vehicles/44/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/vehicles/46/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"starships\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/59/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/65/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/39/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"created\": \"2014-12-10T16:20:44.310000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.327000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/11/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Wilhuff Tarkin\",\n" +
            "\t\t\t\"height\": \"180\",\n" +
            "\t\t\t\"mass\": \"unknown\",\n" +
            "\t\t\t\"hair_color\": \"auburn, grey\",\n" +
            "\t\t\t\"skin_color\": \"fair\",\n" +
            "\t\t\t\"eye_color\": \"blue\",\n" +
            "\t\t\t\"birth_year\": \"64BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/21/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/6/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [],\n" +
            "\t\t\t\"created\": \"2014-12-10T16:26:56.138000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.330000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/12/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Chewbacca\",\n" +
            "\t\t\t\"height\": \"228\",\n" +
            "\t\t\t\"mass\": \"112\",\n" +
            "\t\t\t\"hair_color\": \"brown\",\n" +
            "\t\t\t\"skin_color\": \"unknown\",\n" +
            "\t\t\t\"eye_color\": \"blue\",\n" +
            "\t\t\t\"birth_year\": \"200BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/14/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/2/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/6/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/1/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/7/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/3/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/vehicles/19/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"starships\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/10/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/22/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"created\": \"2014-12-10T16:42:45.066000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.332000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/13/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Han Solo\",\n" +
            "\t\t\t\"height\": \"180\",\n" +
            "\t\t\t\"mass\": \"80\",\n" +
            "\t\t\t\"hair_color\": \"brown\",\n" +
            "\t\t\t\"skin_color\": \"fair\",\n" +
            "\t\t\t\"eye_color\": \"brown\",\n" +
            "\t\t\t\"birth_year\": \"29BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/22/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/2/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/1/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/7/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/10/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/22/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"created\": \"2014-12-10T16:49:14.582000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.334000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/14/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Greedo\",\n" +
            "\t\t\t\"height\": \"173\",\n" +
            "\t\t\t\"mass\": \"74\",\n" +
            "\t\t\t\"hair_color\": \"n/a\",\n" +
            "\t\t\t\"skin_color\": \"green\",\n" +
            "\t\t\t\"eye_color\": \"black\",\n" +
            "\t\t\t\"birth_year\": \"44BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/23/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/4/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [],\n" +
            "\t\t\t\"created\": \"2014-12-10T17:03:30.334000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.336000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/15/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Jabba Desilijic Tiure\",\n" +
            "\t\t\t\"height\": \"175\",\n" +
            "\t\t\t\"mass\": \"1,358\",\n" +
            "\t\t\t\"hair_color\": \"n/a\",\n" +
            "\t\t\t\"skin_color\": \"green-tan, brown\",\n" +
            "\t\t\t\"eye_color\": \"orange\",\n" +
            "\t\t\t\"birth_year\": \"600BBY\",\n" +
            "\t\t\t\"gender\": \"hermaphrodite\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/24/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/4/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/5/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [],\n" +
            "\t\t\t\"created\": \"2014-12-10T17:11:31.638000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.338000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/16/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Wedge Antilles\",\n" +
            "\t\t\t\"height\": \"170\",\n" +
            "\t\t\t\"mass\": \"77\",\n" +
            "\t\t\t\"hair_color\": \"brown\",\n" +
            "\t\t\t\"skin_color\": \"fair\",\n" +
            "\t\t\t\"eye_color\": \"hazel\",\n" +
            "\t\t\t\"birth_year\": \"21BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/22/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/2/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/vehicles/14/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"starships\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/12/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"created\": \"2014-12-12T11:08:06.469000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.341000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/18/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Jek Tono Porkins\",\n" +
            "\t\t\t\"height\": \"180\",\n" +
            "\t\t\t\"mass\": \"110\",\n" +
            "\t\t\t\"hair_color\": \"brown\",\n" +
            "\t\t\t\"skin_color\": \"fair\",\n" +
            "\t\t\t\"eye_color\": \"blue\",\n" +
            "\t\t\t\"birth_year\": \"unknown\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/26/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/12/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"created\": \"2014-12-12T11:16:56.569000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.343000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/19/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Yoda\",\n" +
            "\t\t\t\"height\": \"66\",\n" +
            "\t\t\t\"mass\": \"17\",\n" +
            "\t\t\t\"hair_color\": \"white\",\n" +
            "\t\t\t\"skin_color\": \"green\",\n" +
            "\t\t\t\"eye_color\": \"brown\",\n" +
            "\t\t\t\"birth_year\": \"896BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/28/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/2/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/5/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/4/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/6/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/6/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [],\n" +
            "\t\t\t\"created\": \"2014-12-15T12:26:01.042000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.345000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/20/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Palpatine\",\n" +
            "\t\t\t\"height\": \"170\",\n" +
            "\t\t\t\"mass\": \"75\",\n" +
            "\t\t\t\"hair_color\": \"grey\",\n" +
            "\t\t\t\"skin_color\": \"pale\",\n" +
            "\t\t\t\"eye_color\": \"yellow\",\n" +
            "\t\t\t\"birth_year\": \"82BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/8/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/2/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/5/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/4/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/6/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [],\n" +
            "\t\t\t\"created\": \"2014-12-15T12:48:05.971000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.347000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/21/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Boba Fett\",\n" +
            "\t\t\t\"height\": \"183\",\n" +
            "\t\t\t\"mass\": \"78.2\",\n" +
            "\t\t\t\"hair_color\": \"black\",\n" +
            "\t\t\t\"skin_color\": \"fair\",\n" +
            "\t\t\t\"eye_color\": \"brown\",\n" +
            "\t\t\t\"birth_year\": \"31.5BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/10/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/2/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/5/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/21/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"created\": \"2014-12-15T12:49:32.457000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.349000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/22/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"IG-88\",\n" +
            "\t\t\t\"height\": \"200\",\n" +
            "\t\t\t\"mass\": \"140\",\n" +
            "\t\t\t\"hair_color\": \"none\",\n" +
            "\t\t\t\"skin_color\": \"metal\",\n" +
            "\t\t\t\"eye_color\": \"red\",\n" +
            "\t\t\t\"birth_year\": \"15BBY\",\n" +
            "\t\t\t\"gender\": \"none\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/28/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/2/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/2/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [],\n" +
            "\t\t\t\"created\": \"2014-12-15T12:51:10.076000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.351000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/23/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Bossk\",\n" +
            "\t\t\t\"height\": \"190\",\n" +
            "\t\t\t\"mass\": \"113\",\n" +
            "\t\t\t\"hair_color\": \"none\",\n" +
            "\t\t\t\"skin_color\": \"green\",\n" +
            "\t\t\t\"eye_color\": \"red\",\n" +
            "\t\t\t\"birth_year\": \"53BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/29/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/2/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/7/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [],\n" +
            "\t\t\t\"created\": \"2014-12-15T12:53:49.297000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.355000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/24/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Lando Calrissian\",\n" +
            "\t\t\t\"height\": \"177\",\n" +
            "\t\t\t\"mass\": \"79\",\n" +
            "\t\t\t\"hair_color\": \"black\",\n" +
            "\t\t\t\"skin_color\": \"dark\",\n" +
            "\t\t\t\"eye_color\": \"brown\",\n" +
            "\t\t\t\"birth_year\": \"31BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/30/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/2/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/10/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"created\": \"2014-12-15T12:56:32.683000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.357000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/25/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Lobot\",\n" +
            "\t\t\t\"height\": \"175\",\n" +
            "\t\t\t\"mass\": \"79\",\n" +
            "\t\t\t\"hair_color\": \"none\",\n" +
            "\t\t\t\"skin_color\": \"light\",\n" +
            "\t\t\t\"eye_color\": \"blue\",\n" +
            "\t\t\t\"birth_year\": \"37BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/6/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/2/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [],\n" +
            "\t\t\t\"created\": \"2014-12-15T13:01:57.178000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.359000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/26/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Ackbar\",\n" +
            "\t\t\t\"height\": \"180\",\n" +
            "\t\t\t\"mass\": \"83\",\n" +
            "\t\t\t\"hair_color\": \"none\",\n" +
            "\t\t\t\"skin_color\": \"brown mottle\",\n" +
            "\t\t\t\"eye_color\": \"orange\",\n" +
            "\t\t\t\"birth_year\": \"41BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/31/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\",\n" +
            "\t\t\t\t\"https://swapi.co/api/films/7/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/8/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [],\n" +
            "\t\t\t\"created\": \"2014-12-18T11:07:50.584000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.362000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/27/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Mon Mothma\",\n" +
            "\t\t\t\"height\": \"150\",\n" +
            "\t\t\t\"mass\": \"unknown\",\n" +
            "\t\t\t\"hair_color\": \"auburn\",\n" +
            "\t\t\t\"skin_color\": \"fair\",\n" +
            "\t\t\t\"eye_color\": \"blue\",\n" +
            "\t\t\t\"birth_year\": \"48BBY\",\n" +
            "\t\t\t\"gender\": \"female\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/32/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [],\n" +
            "\t\t\t\"created\": \"2014-12-18T11:12:38.895000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.364000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/28/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Arvel Crynyd\",\n" +
            "\t\t\t\"height\": \"unknown\",\n" +
            "\t\t\t\"mass\": \"unknown\",\n" +
            "\t\t\t\"hair_color\": \"brown\",\n" +
            "\t\t\t\"skin_color\": \"fair\",\n" +
            "\t\t\t\"eye_color\": \"brown\",\n" +
            "\t\t\t\"birth_year\": \"unknown\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/28/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/1/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/28/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"created\": \"2014-12-18T11:16:33.020000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.367000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/29/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Wicket Systri Warrick\",\n" +
            "\t\t\t\"height\": \"88\",\n" +
            "\t\t\t\"mass\": \"20\",\n" +
            "\t\t\t\"hair_color\": \"brown\",\n" +
            "\t\t\t\"skin_color\": \"brown\",\n" +
            "\t\t\t\"eye_color\": \"brown\",\n" +
            "\t\t\t\"birth_year\": \"8BBY\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/7/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/9/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [],\n" +
            "\t\t\t\"created\": \"2014-12-18T11:21:58.954000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.369000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/30/\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"Nien Nunb\",\n" +
            "\t\t\t\"height\": \"160\",\n" +
            "\t\t\t\"mass\": \"68\",\n" +
            "\t\t\t\"hair_color\": \"none\",\n" +
            "\t\t\t\"skin_color\": \"grey\",\n" +
            "\t\t\t\"eye_color\": \"black\",\n" +
            "\t\t\t\"birth_year\": \"unknown\",\n" +
            "\t\t\t\"gender\": \"male\",\n" +
            "\t\t\t\"homeworld\": \"https://swapi.co/api/planets/33/\",\n" +
            "\t\t\t\"films\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/films/3/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"species\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/species/10/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"vehicles\": [],\n" +
            "\t\t\t\"starships\": [\n" +
            "\t\t\t\t\"https://swapi.co/api/starships/10/\"\n" +
            "\t\t\t],\n" +
            "\t\t\t\"created\": \"2014-12-18T11:26:18.541000Z\",\n" +
            "\t\t\t\"edited\": \"2014-12-20T21:17:50.371000Z\",\n" +
            "\t\t\t\"url\": \"https://swapi.co/api/people/31/\"\n" +
            "\t\t}\n" +
            "]";


    @Inject
    public StarWarsCharactersViewModel() {
    }

    List<Character> getCharacters() {
        Gson gson = new Gson();
        Type listType =  new TypeToken<List<Character>>(){}.getType();
        return gson.fromJson(API_RESPONE, listType);
    }
}
