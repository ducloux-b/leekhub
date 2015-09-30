
package io.battlearena.leekhub.tools.client;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

@Generated(value = {
    "wadl|file:/D:/Profiles/tHingant/Workspaces/Battle%20Code/leekhub/application/tools/src/main/wadl/application.wadl"
}, comments = "wadl2java, http://wadl.java.net", date = "2015-09-30T18:10:26.524+02:00")
public class IP521913975_BattleWs {

    /**
     * The base URI for the resource represented by this proxy
     * 
     */
    public final static URI BASE_URI;

    static {
        URI originalURI = URI.create("http://52.19.139.75/battle-ws/");
        // Look up to see if we have any indirection in the local copy
        // of META-INF/java-rs-catalog.xml file, assuming it will be in the
        // oasis:name:tc:entity:xmlns:xml:catalog namespace or similar duck type
        java.io.InputStream is = IP521913975_BattleWs.class.getResourceAsStream("/META-INF/jax-rs-catalog.xml");
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

    public static IP521913975_BattleWs.Duel duel(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new IP521913975_BattleWs.Duel(client, baseURI);
    }

    /**
     * Template method to allow tooling to customize the new Client
     * 
     */
    private static void customizeClientConfiguration(ClientConfig cc) {
    	System.setProperty("http.proxyHost", "ntes.proxy.corp.sopra");
        System.setProperty("http.proxyPort", "8080");
    }

    /**
     * Template method to allow tooling to override Client factory
     * 
     */
    private static com.sun.jersey.api.client.Client createClientInstance(ClientConfig cc) {
        return com.sun.jersey.api.client.Client.create(cc);
    }

    /**
     * Create a new Client instance
     * 
     */
    public static com.sun.jersey.api.client.Client createClient() {
        ClientConfig cc = new DefaultClientConfig();
        customizeClientConfiguration(cc);
        return createClientInstance(cc);
    }

    public static IP521913975_BattleWs.Duel duel() {
        return duel(createClient(), BASE_URI);
    }

    public static IP521913975_BattleWs.Duel duel(com.sun.jersey.api.client.Client client) {
        return duel(client, BASE_URI);
    }

    public static class Duel {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Duel(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Duel(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("/duel/");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public IP521913975_BattleWs.Duel.GamePlayIdPartieIdEquipeMove gamePlayIdPartieIdEquipeMove(String idpartie, String idequipe, String move) {
            return new IP521913975_BattleWs.Duel.GamePlayIdPartieIdEquipeMove(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), idpartie, idequipe, move);
        }

        public IP521913975_BattleWs.Duel.GameBoardIdPartie gameBoardIdPartie(String idpartie) {
            return new IP521913975_BattleWs.Duel.GameBoardIdPartie(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), idpartie);
        }

        public IP521913975_BattleWs.Duel.GameGetlastmoveIdPartieIdEquipe gameGetlastmoveIdPartieIdEquipe(String idpartie, String idequipe) {
            return new IP521913975_BattleWs.Duel.GameGetlastmoveIdPartieIdEquipe(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), idpartie, idequipe);
        }

        public IP521913975_BattleWs.Duel.PlayerGetIdEquipeNomEquipeMotDePasse playerGetIdEquipeNomEquipeMotDePasse(String nomequipe, String motdepasse) {
            return new IP521913975_BattleWs.Duel.PlayerGetIdEquipeNomEquipeMotDePasse(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), nomequipe, motdepasse);
        }

        public IP521913975_BattleWs.Duel.Ping ping() {
            return new IP521913975_BattleWs.Duel.Ping(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public IP521913975_BattleWs.Duel.VersusNextIdEquipe versusNextIdEquipe(String idequipe) {
            return new IP521913975_BattleWs.Duel.VersusNextIdEquipe(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), idequipe);
        }

        public IP521913975_BattleWs.Duel.GameOpponentIdPartieIdEquipe gameOpponentIdPartieIdEquipe(String idpartie, String idequipe) {
            return new IP521913975_BattleWs.Duel.GameOpponentIdPartieIdEquipe(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), idpartie, idequipe);
        }

        public IP521913975_BattleWs.Duel.PracticeNewLevelIdEquipe practiceNewLevelIdEquipe(String level, String idequipe) {
            return new IP521913975_BattleWs.Duel.PracticeNewLevelIdEquipe(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), level, idequipe);
        }

        public IP521913975_BattleWs.Duel.GameStatusIdPartieIdEquipe gameStatusIdPartieIdEquipe(String idpartie, String idequipe) {
            return new IP521913975_BattleWs.Duel.GameStatusIdPartieIdEquipe(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), idpartie, idequipe);
        }

        public static class GameBoardIdPartie {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private GameBoardIdPartie(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public GameBoardIdPartie(com.sun.jersey.api.client.Client client, URI baseUri, String idpartie) {
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
            public GameBoardIdPartie(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/duel/game/board/{idPartie}");
                } else {
                    template.append("duel/game/board/{idPartie}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
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
            public IP521913975_BattleWs.Duel.GameBoardIdPartie setIdpartie(String idpartie) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idPartie", idpartie);
                return new IP521913975_BattleWs.Duel.GameBoardIdPartie(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(String format, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (format == null) {
                }
                if (format!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("format", format);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("format", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(String format, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (format == null) {
                }
                if (format!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("format", format);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("format", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class GameGetlastmoveIdPartieIdEquipe {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private GameGetlastmoveIdPartieIdEquipe(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public GameGetlastmoveIdPartieIdEquipe(com.sun.jersey.api.client.Client client, URI baseUri, String idpartie, String idequipe) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/game/getlastmove/{idPartie}/{idEquipe}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("idPartie", idpartie);
                _templateAndMatrixParameterValues.put("idEquipe", idequipe);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public GameGetlastmoveIdPartieIdEquipe(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/duel/game/getlastmove/{idPartie}/{idEquipe}");
                } else {
                    template.append("duel/game/getlastmove/{idPartie}/{idEquipe}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
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
            public IP521913975_BattleWs.Duel.GameGetlastmoveIdPartieIdEquipe setIdpartie(String idpartie) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idPartie", idpartie);
                return new IP521913975_BattleWs.Duel.GameGetlastmoveIdPartieIdEquipe(_client, copyUriBuilder, copyMap);
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
            public IP521913975_BattleWs.Duel.GameGetlastmoveIdPartieIdEquipe setIdequipe(String idequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idEquipe", idequipe);
                return new IP521913975_BattleWs.Duel.GameGetlastmoveIdPartieIdEquipe(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class GameOpponentIdPartieIdEquipe {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private GameOpponentIdPartieIdEquipe(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public GameOpponentIdPartieIdEquipe(com.sun.jersey.api.client.Client client, URI baseUri, String idpartie, String idequipe) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/game/opponent/{idPartie}/{idEquipe}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("idPartie", idpartie);
                _templateAndMatrixParameterValues.put("idEquipe", idequipe);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public GameOpponentIdPartieIdEquipe(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/duel/game/opponent/{idPartie}/{idEquipe}");
                } else {
                    template.append("duel/game/opponent/{idPartie}/{idEquipe}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
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
            public IP521913975_BattleWs.Duel.GameOpponentIdPartieIdEquipe setIdpartie(String idpartie) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idPartie", idpartie);
                return new IP521913975_BattleWs.Duel.GameOpponentIdPartieIdEquipe(_client, copyUriBuilder, copyMap);
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
            public IP521913975_BattleWs.Duel.GameOpponentIdPartieIdEquipe setIdequipe(String idequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idEquipe", idequipe);
                return new IP521913975_BattleWs.Duel.GameOpponentIdPartieIdEquipe(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class GamePlayIdPartieIdEquipeMove {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private GamePlayIdPartieIdEquipeMove(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public GamePlayIdPartieIdEquipeMove(com.sun.jersey.api.client.Client client, URI baseUri, String idpartie, String idequipe, String move) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/game/play/{idPartie}/{idEquipe}/{move}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("idPartie", idpartie);
                _templateAndMatrixParameterValues.put("idEquipe", idequipe);
                _templateAndMatrixParameterValues.put("move", move);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public GamePlayIdPartieIdEquipeMove(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/duel/game/play/{idPartie}/{idEquipe}/{move}");
                } else {
                    template.append("duel/game/play/{idPartie}/{idEquipe}/{move}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
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
            public IP521913975_BattleWs.Duel.GamePlayIdPartieIdEquipeMove setIdpartie(String idpartie) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idPartie", idpartie);
                return new IP521913975_BattleWs.Duel.GamePlayIdPartieIdEquipeMove(_client, copyUriBuilder, copyMap);
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
            public IP521913975_BattleWs.Duel.GamePlayIdPartieIdEquipeMove setIdequipe(String idequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idEquipe", idequipe);
                return new IP521913975_BattleWs.Duel.GamePlayIdPartieIdEquipeMove(_client, copyUriBuilder, copyMap);
            }

            /**
             * Get move
             * 
             */
            public String getMove() {
                return ((String) _templateAndMatrixParameterValues.get("move"));
            }

            /**
             * Duplicate state and set move
             * 
             */
            public IP521913975_BattleWs.Duel.GamePlayIdPartieIdEquipeMove setMove(String move) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("move", move);
                return new IP521913975_BattleWs.Duel.GamePlayIdPartieIdEquipeMove(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class GameStatusIdPartieIdEquipe {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private GameStatusIdPartieIdEquipe(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public GameStatusIdPartieIdEquipe(com.sun.jersey.api.client.Client client, URI baseUri, String idpartie, String idequipe) {
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
            public GameStatusIdPartieIdEquipe(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/duel/game/status/{idPartie}/{idEquipe}");
                } else {
                    template.append("duel/game/status/{idPartie}/{idEquipe}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
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
            public IP521913975_BattleWs.Duel.GameStatusIdPartieIdEquipe setIdpartie(String idpartie) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idPartie", idpartie);
                return new IP521913975_BattleWs.Duel.GameStatusIdPartieIdEquipe(_client, copyUriBuilder, copyMap);
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
            public IP521913975_BattleWs.Duel.GameStatusIdPartieIdEquipe setIdequipe(String idequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idEquipe", idequipe);
                return new IP521913975_BattleWs.Duel.GameStatusIdPartieIdEquipe(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Ping {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Ping(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Ping(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/ping");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class PlayerGetIdEquipeNomEquipeMotDePasse {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private PlayerGetIdEquipeNomEquipeMotDePasse(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public PlayerGetIdEquipeNomEquipeMotDePasse(com.sun.jersey.api.client.Client client, URI baseUri, String nomequipe, String motdepasse) {
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
            public PlayerGetIdEquipeNomEquipeMotDePasse(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/duel/player/getIdEquipe/{nomEquipe}/{motDePasse}");
                } else {
                    template.append("duel/player/getIdEquipe/{nomEquipe}/{motDePasse}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
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
            public IP521913975_BattleWs.Duel.PlayerGetIdEquipeNomEquipeMotDePasse setNomequipe(String nomequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("nomEquipe", nomequipe);
                return new IP521913975_BattleWs.Duel.PlayerGetIdEquipeNomEquipeMotDePasse(_client, copyUriBuilder, copyMap);
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
            public IP521913975_BattleWs.Duel.PlayerGetIdEquipeNomEquipeMotDePasse setMotdepasse(String motdepasse) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("motDePasse", motdepasse);
                return new IP521913975_BattleWs.Duel.PlayerGetIdEquipeNomEquipeMotDePasse(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class PracticeNewLevelIdEquipe {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private PracticeNewLevelIdEquipe(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public PracticeNewLevelIdEquipe(com.sun.jersey.api.client.Client client, URI baseUri, String level, String idequipe) {
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
            public PracticeNewLevelIdEquipe(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/duel/practice/new/{level}/{idEquipe}");
                } else {
                    template.append("duel/practice/new/{level}/{idEquipe}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
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
            public IP521913975_BattleWs.Duel.PracticeNewLevelIdEquipe setLevel(String level) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("level", level);
                return new IP521913975_BattleWs.Duel.PracticeNewLevelIdEquipe(_client, copyUriBuilder, copyMap);
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
            public IP521913975_BattleWs.Duel.PracticeNewLevelIdEquipe setIdequipe(String idequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idEquipe", idequipe);
                return new IP521913975_BattleWs.Duel.PracticeNewLevelIdEquipe(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class VersusNextIdEquipe {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private VersusNextIdEquipe(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public VersusNextIdEquipe(com.sun.jersey.api.client.Client client, URI baseUri, String idequipe) {
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
            public VersusNextIdEquipe(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/duel/versus/next/{idEquipe}");
                } else {
                    template.append("duel/versus/next/{idEquipe}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
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
            public IP521913975_BattleWs.Duel.VersusNextIdEquipe setIdequipe(String idequipe) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("idEquipe", idequipe);
                return new IP521913975_BattleWs.Duel.VersusNextIdEquipe(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new IP521913975_BattleWs.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
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
