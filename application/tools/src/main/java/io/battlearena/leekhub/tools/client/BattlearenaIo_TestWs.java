package io.battlearena.leekhub.tools.client;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configurable;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.uri.UriTemplate;

@Generated(value = {
    "wadl|file:/D:/Profiles/tHingant/Workspaces/Battle%20Code/application.wadl"
}, comments = "wadl2java, http://wadl.java.net", date = "2015-09-23T18:14:38.526+02:00")
public class BattlearenaIo_TestWs {
	
    /**
     * The base URI for the resource represented by this proxy
     * 
     */
    public final static URI BASE_URI;

    static {
        URI originalURI = URI.create("http://battlearena.io/test-ws/");
        // Look up to see if we have any indirection in the local copy
        // of META-INF/java-rs-catalog.xml file, assuming it will be in the
        // oasis:name:tc:entity:xmlns:xml:catalog namespace or similar duck type
        java.io.InputStream is = BattlearenaIo_TestWs.class.getResourceAsStream("/META-INF/jax-rs-catalog.xml");
        if (is!=null) {
            try {
                // Ignore the namespace in the catalog, can't use wildcard until
                // we are sure we have XPath 2.0
                String found = javax.xml.xpath.XPathFactory.newInstance().newXPath().evaluate(
                    "/*[name(.) = 'catalog']/*[name(.) = 'uri' and @name ='" + originalURI +"']/@uri", 
                    new org.xml.sax.InputSource(is)); 
                if (found!=null && found.length()>0) {
                    originalURI = java.net.URI.create(found);
                }
                
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            finally {
                try {
                    is.close();
                } catch (java.io.IOException e) {
                }
            }
        }
        BASE_URI = originalURI;
    }

    public static BattlearenaIo_TestWs.Root root(Client client, URI baseURI) {
        return new BattlearenaIo_TestWs.Root(client, baseURI);
    }

    /**
     * Template method to allow tooling to customize the new Client
     * 
     */
    private static void customizeClientConfiguration(Configurable cc) {
    	System.setProperty("http.proxyHost", "ntes.proxy.corp.sopra");
        System.setProperty("http.proxyPort", "8080");
    	cc.property(ClientProperties.PROXY_URI, "ntes.proxy.corp.sopra:8080");
    }

    /**
     * Template method to allow tooling to override Client factory
     * 
     */
    private static Client createClientInstance() {
        return ClientBuilder.newClient();
    }

    /**
     * Create a new Client instance
     * 
     */
    public static Client createClient() {
        Client client = createClientInstance();
        customizeClientConfiguration(client);
        return client;
    }

    public static BattlearenaIo_TestWs.Root root() {
        return root(createClient(), BASE_URI);
    }

    public static BattlearenaIo_TestWs.Root root(Client client) {
        return root(client, BASE_URI);
    }

    public static class Root {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Root(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Root(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("/");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public BattlearenaIo_TestWs.Root.PracticeNextIdEquipe practiceNextIdEquipe(String idequipe) {
            return new BattlearenaIo_TestWs.Root.PracticeNextIdEquipe(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), idequipe);
        }

        public BattlearenaIo_TestWs.Root.GameStatusIdPartieIdEquipe gameStatusIdPartieIdEquipe(String idpartie, String idequipe) {
            return new BattlearenaIo_TestWs.Root.GameStatusIdPartieIdEquipe(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), idpartie, idequipe);
        }

        public BattlearenaIo_TestWs.Root.Ping ping() {
            return new BattlearenaIo_TestWs.Root.Ping(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public BattlearenaIo_TestWs.Root.PingError500 pingError500() {
            return new BattlearenaIo_TestWs.Root.PingError500(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public BattlearenaIo_TestWs.Root.PingError403 pingError403() {
            return new BattlearenaIo_TestWs.Root.PingError403(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public BattlearenaIo_TestWs.Root.VersusNextIdEquipe versusNextIdEquipe(String idequipe) {
            return new BattlearenaIo_TestWs.Root.VersusNextIdEquipe(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), idequipe);
        }

        public BattlearenaIo_TestWs.Root.PracticeNewLevelIdEquipe practiceNewLevelIdEquipe(String level, String idequipe) {
            return new BattlearenaIo_TestWs.Root.PracticeNewLevelIdEquipe(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), level, idequipe);
        }

        public BattlearenaIo_TestWs.Root.GameBoardIdPartie gameBoardIdPartie(String idpartie) {
            return new BattlearenaIo_TestWs.Root.GameBoardIdPartie(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), idpartie);
        }

        public BattlearenaIo_TestWs.Root.GamePlayIdPartieIdEquipeCoordXCoordY gamePlayIdPartieIdEquipeCoordXCoordY(String idpartie, String idequipe, String coordx, String coordy) {
            return new BattlearenaIo_TestWs.Root.GamePlayIdPartieIdEquipeCoordXCoordY(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), idpartie, idequipe, coordx, coordy);
        }

        public BattlearenaIo_TestWs.Root.GameGetlastmoveIdPartie gameGetlastmoveIdPartie(String idpartie) {
            return new BattlearenaIo_TestWs.Root.GameGetlastmoveIdPartie(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), idpartie);
        }

        public BattlearenaIo_TestWs.Root.PlayerGetIdEquipeNomEquipeMotDePasse playerGetIdEquipeNomEquipeMotDePasse(String nomequipe, String motdepasse) {
            return new BattlearenaIo_TestWs.Root.PlayerGetIdEquipeNomEquipeMotDePasse(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), nomequipe, motdepasse);
        }

        public static class GameBoardIdPartie {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private GameBoardIdPartie(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public GameBoardIdPartie(Client client, URI baseUri, String idpartie) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/game/board/{idPartie}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("idPartie", idpartie);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public GameBoardIdPartie(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/game/board/{idPartie}");
                } else {
                    template.append("game/board/{idPartie}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get idPartie
             * 
             */
            public String getIdpartie() {
                return ((String) _templateAndMatrixParameterValues.get("idPartie"));
            }

            /**
             * Duplicate state and set idPartie
             * 
             */
            public BattlearenaIo_TestWs.Root.GameBoardIdPartie setIdpartie(String idpartie) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idPartie", idpartie);
                return new BattlearenaIo_TestWs.Root.GameBoardIdPartie(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAs(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAs(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAs(String format, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (format == null) {
                }
                if (format!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("format", format);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("format", ((Object[]) null));
                }
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAs(String format, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (format == null) {
                }
                if (format!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("format", format);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("format", ((Object[]) null));
                }
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class GameGetlastmoveIdPartie {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private GameGetlastmoveIdPartie(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public GameGetlastmoveIdPartie(Client client, URI baseUri, String idpartie) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/game/getlastmove/{idPartie}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("idPartie", idpartie);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public GameGetlastmoveIdPartie(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/game/getlastmove/{idPartie}");
                } else {
                    template.append("game/getlastmove/{idPartie}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get idPartie
             * 
             */
            public String getIdpartie() {
                return ((String) _templateAndMatrixParameterValues.get("idPartie"));
            }

            /**
             * Duplicate state and set idPartie
             * 
             */
            public BattlearenaIo_TestWs.Root.GameGetlastmoveIdPartie setIdpartie(String idpartie) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idPartie", idpartie);
                return new BattlearenaIo_TestWs.Root.GameGetlastmoveIdPartie(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class GamePlayIdPartieIdEquipeCoordXCoordY {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private GamePlayIdPartieIdEquipeCoordXCoordY(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public GamePlayIdPartieIdEquipeCoordXCoordY(Client client, URI baseUri, String idpartie, String idequipe, String coordx, String coordy) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/game/play/{idPartie}/{idEquipe}/{coordX}/{coordY}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("idPartie", idpartie);
                _templateAndMatrixParameterValues.put("idEquipe", idequipe);
                _templateAndMatrixParameterValues.put("coordX", coordx);
                _templateAndMatrixParameterValues.put("coordY", coordy);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public GamePlayIdPartieIdEquipeCoordXCoordY(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/game/play/{idPartie}/{idEquipe}/{coordX}/{coordY}");
                } else {
                    template.append("game/play/{idPartie}/{idEquipe}/{coordX}/{coordY}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get idPartie
             * 
             */
            public String getIdpartie() {
                return ((String) _templateAndMatrixParameterValues.get("idPartie"));
            }

            /**
             * Duplicate state and set idPartie
             * 
             */
            public BattlearenaIo_TestWs.Root.GamePlayIdPartieIdEquipeCoordXCoordY setIdpartie(String idpartie) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idPartie", idpartie);
                return new BattlearenaIo_TestWs.Root.GamePlayIdPartieIdEquipeCoordXCoordY(_client, copyUriBuilder, copyMap);
            }

            /**
             * Get idEquipe
             * 
             */
            public String getIdequipe() {
                return ((String) _templateAndMatrixParameterValues.get("idEquipe"));
            }

            /**
             * Duplicate state and set idEquipe
             * 
             */
            public BattlearenaIo_TestWs.Root.GamePlayIdPartieIdEquipeCoordXCoordY setIdequipe(String idequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idEquipe", idequipe);
                return new BattlearenaIo_TestWs.Root.GamePlayIdPartieIdEquipeCoordXCoordY(_client, copyUriBuilder, copyMap);
            }

            /**
             * Get coordX
             * 
             */
            public String getCoordx() {
                return ((String) _templateAndMatrixParameterValues.get("coordX"));
            }

            /**
             * Duplicate state and set coordX
             * 
             */
            public BattlearenaIo_TestWs.Root.GamePlayIdPartieIdEquipeCoordXCoordY setCoordx(String coordx) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("coordX", coordx);
                return new BattlearenaIo_TestWs.Root.GamePlayIdPartieIdEquipeCoordXCoordY(_client, copyUriBuilder, copyMap);
            }

            /**
             * Get coordY
             * 
             */
            public String getCoordy() {
                return ((String) _templateAndMatrixParameterValues.get("coordY"));
            }

            /**
             * Duplicate state and set coordY
             * 
             */
            public BattlearenaIo_TestWs.Root.GamePlayIdPartieIdEquipeCoordXCoordY setCoordy(String coordy) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("coordY", coordy);
                return new BattlearenaIo_TestWs.Root.GamePlayIdPartieIdEquipeCoordXCoordY(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class GameStatusIdPartieIdEquipe {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private GameStatusIdPartieIdEquipe(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public GameStatusIdPartieIdEquipe(Client client, URI baseUri, String idpartie, String idequipe) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/game/status/{idPartie}/{idEquipe}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("idPartie", idpartie);
                _templateAndMatrixParameterValues.put("idEquipe", idequipe);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public GameStatusIdPartieIdEquipe(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/game/status/{idPartie}/{idEquipe}");
                } else {
                    template.append("game/status/{idPartie}/{idEquipe}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get idPartie
             * 
             */
            public String getIdpartie() {
                return ((String) _templateAndMatrixParameterValues.get("idPartie"));
            }

            /**
             * Duplicate state and set idPartie
             * 
             */
            public BattlearenaIo_TestWs.Root.GameStatusIdPartieIdEquipe setIdpartie(String idpartie) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idPartie", idpartie);
                return new BattlearenaIo_TestWs.Root.GameStatusIdPartieIdEquipe(_client, copyUriBuilder, copyMap);
            }

            /**
             * Get idEquipe
             * 
             */
            public String getIdequipe() {
                return ((String) _templateAndMatrixParameterValues.get("idEquipe"));
            }

            /**
             * Duplicate state and set idEquipe
             * 
             */
            public BattlearenaIo_TestWs.Root.GameStatusIdPartieIdEquipe setIdequipe(String idequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idEquipe", idequipe);
                return new BattlearenaIo_TestWs.Root.GameStatusIdPartieIdEquipe(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Ping {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Ping(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Ping(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/ping");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class PingError403 {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private PingError403(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public PingError403(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/pingError403");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class PingError500 {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private PingError500(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public PingError500(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/pingError500");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class PlayerGetIdEquipeNomEquipeMotDePasse {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private PlayerGetIdEquipeNomEquipeMotDePasse(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public PlayerGetIdEquipeNomEquipeMotDePasse(Client client, URI baseUri, String nomequipe, String motdepasse) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/player/getIdEquipe/{nomEquipe}/{motDePasse}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("nomEquipe", nomequipe);
                _templateAndMatrixParameterValues.put("motDePasse", motdepasse);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public PlayerGetIdEquipeNomEquipeMotDePasse(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/player/getIdEquipe/{nomEquipe}/{motDePasse}");
                } else {
                    template.append("player/getIdEquipe/{nomEquipe}/{motDePasse}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get nomEquipe
             * 
             */
            public String getNomequipe() {
                return ((String) _templateAndMatrixParameterValues.get("nomEquipe"));
            }

            /**
             * Duplicate state and set nomEquipe
             * 
             */
            public BattlearenaIo_TestWs.Root.PlayerGetIdEquipeNomEquipeMotDePasse setNomequipe(String nomequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("nomEquipe", nomequipe);
                return new BattlearenaIo_TestWs.Root.PlayerGetIdEquipeNomEquipeMotDePasse(_client, copyUriBuilder, copyMap);
            }

            /**
             * Get motDePasse
             * 
             */
            public String getMotdepasse() {
                return ((String) _templateAndMatrixParameterValues.get("motDePasse"));
            }

            /**
             * Duplicate state and set motDePasse
             * 
             */
            public BattlearenaIo_TestWs.Root.PlayerGetIdEquipeNomEquipeMotDePasse setMotdepasse(String motdepasse) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("motDePasse", motdepasse);
                return new BattlearenaIo_TestWs.Root.PlayerGetIdEquipeNomEquipeMotDePasse(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {            	
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class PracticeNewLevelIdEquipe {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private PracticeNewLevelIdEquipe(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public PracticeNewLevelIdEquipe(Client client, URI baseUri, String level, String idequipe) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/practice/new/{level}/{idEquipe}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("level", level);
                _templateAndMatrixParameterValues.put("idEquipe", idequipe);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public PracticeNewLevelIdEquipe(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/practice/new/{level}/{idEquipe}");
                } else {
                    template.append("practice/new/{level}/{idEquipe}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get level
             * 
             */
            public String getLevel() {
                return ((String) _templateAndMatrixParameterValues.get("level"));
            }

            /**
             * Duplicate state and set level
             * 
             */
            public BattlearenaIo_TestWs.Root.PracticeNewLevelIdEquipe setLevel(String level) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("level", level);
                return new BattlearenaIo_TestWs.Root.PracticeNewLevelIdEquipe(_client, copyUriBuilder, copyMap);
            }

            /**
             * Get idEquipe
             * 
             */
            public String getIdequipe() {
                return ((String) _templateAndMatrixParameterValues.get("idEquipe"));
            }

            /**
             * Duplicate state and set idEquipe
             * 
             */
            public BattlearenaIo_TestWs.Root.PracticeNewLevelIdEquipe setIdequipe(String idequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idEquipe", idequipe);
                return new BattlearenaIo_TestWs.Root.PracticeNewLevelIdEquipe(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class PracticeNextIdEquipe {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private PracticeNextIdEquipe(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public PracticeNextIdEquipe(Client client, URI baseUri, String idequipe) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/practice/next/{idEquipe}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("idEquipe", idequipe);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public PracticeNextIdEquipe(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/practice/next/{idEquipe}");
                } else {
                    template.append("practice/next/{idEquipe}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get idEquipe
             * 
             */
            public String getIdequipe() {
                return ((String) _templateAndMatrixParameterValues.get("idEquipe"));
            }

            /**
             * Duplicate state and set idEquipe
             * 
             */
            public BattlearenaIo_TestWs.Root.PracticeNextIdEquipe setIdequipe(String idequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idEquipe", idequipe);
                return new BattlearenaIo_TestWs.Root.PracticeNextIdEquipe(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class VersusNextIdEquipe {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private VersusNextIdEquipe(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public VersusNextIdEquipe(Client client, URI baseUri, String idequipe) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/versus/next/{idEquipe}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("idEquipe", idequipe);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public VersusNextIdEquipe(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/versus/next/{idEquipe}");
                } else {
                    template.append("versus/next/{idEquipe}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get idEquipe
             * 
             */
            public String getIdequipe() {
                return ((String) _templateAndMatrixParameterValues.get("idEquipe"));
            }

            /**
             * Duplicate state and set idEquipe
             * 
             */
            public BattlearenaIo_TestWs.Root.VersusNextIdEquipe setIdequipe(String idequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idEquipe", idequipe);
                return new BattlearenaIo_TestWs.Root.VersusNextIdEquipe(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new BattlearenaIo_TestWs.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }


    /**
     * Workaround for JAX_RS_SPEC-312
     * 
     */
    private static class WebApplicationExceptionMessage
        extends WebApplicationException
    {


        private WebApplicationExceptionMessage(Response response) {
            super(response);
        }

        /**
         * Workaround for JAX_RS_SPEC-312
         * 
         */
        public String getMessage() {
            Response response = getResponse();
            Response.Status status = Response.Status.fromStatusCode(response.getStatus());
            if (status!= null) {
                return (response.getStatus()+(" "+ status.getReasonPhrase()));
            } else {
                return Integer.toString(response.getStatus());
            }
        }

        public String toString() {
            String s = "javax.ws.rs.WebApplicationException";
            String message = getLocalizedMessage();
            return (s +(": "+ message));
        }

    }

}
