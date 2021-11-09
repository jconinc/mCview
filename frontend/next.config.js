module.exports = {
   async rewrites() {
        return [
            {
                source: '/:any*',
                destination: '/',
            },
        ];
    },
	exportPathMap: async function (
		defaultPathMap,
		{ dev, dir, outDir, distDir, buildId }
	  ) {
		return {
		  '/': { page: '/' },
		  '/cview/search': { page: '/cview/search' },
		  '/cview/carrier-details': { page: '/cview/carrier-details' },
		  '/cview/vehicle-details': { page: '/cview/vehicle-details' },
		}
	  },
	images: {
		disableStaticImages: true,
		loader: 'imgix',
	},
}
