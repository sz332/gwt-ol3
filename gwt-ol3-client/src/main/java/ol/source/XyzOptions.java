package ol.source;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.tilegrid.TileGrid;

/**
 * XYZ options.
 *
 * @author Tino Desjardins
 *
 */
@JsType(isNative = true)
public interface XyzOptions extends SourceOptions {

    /**
     * Gets the {@link TileGrid}.
     *
     * @return tileGrid {@link TileGrid}
     */
    @JsProperty
    TileGrid getTileGrid();

    /**
     * Set the optional max zoom level. Default is 18.
     *
     * @param maxZoom max zoom
     */
    @JsProperty
    void setMaxZoom(int maxZoom);

    /**
     * Set the {@link TileGrid}.
     *
     * @param tileGrid {@link TileGrid}
     */
    @JsProperty
    void setTileGrid(TileGrid tileGrid);

    /**
     * Set the URL template. Must include {x}, {y} or {-y}, and {z}
     * placeholders. A {?-?} template pattern, for example
     * subdomain{a-f}.domain.com, may be used instead of defining each one
     * separately in the urls option.
     *
     * @param url
     *            URL template
     */
    @JsProperty
    void setUrl(String url);

    /**
     * Set the URL templates. Must include {x}, {y} or {-y}, and {z}
     * placeholders. A {?-?} template pattern, for example
     * subdomain{a-f}.domain.com, may be used instead of defining each one
     * separately in the urls option.
     *
     * @param urls
     *            array of URL templates
     */
    @JsProperty
    void setUrls(String[] urls);

}
